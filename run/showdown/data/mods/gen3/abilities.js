"use strict";
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __export = (target, all) => {
  for (var name in all)
    __defProp(target, name, { get: all[name], enumerable: true });
};
var __copyProps = (to, from, except, desc) => {
  if (from && typeof from === "object" || typeof from === "function") {
    for (let key of __getOwnPropNames(from))
      if (!__hasOwnProp.call(to, key) && key !== except)
        __defProp(to, key, { get: () => from[key], enumerable: !(desc = __getOwnPropDesc(from, key)) || desc.enumerable });
  }
  return to;
};
var __toCommonJS = (mod) => __copyProps(__defProp({}, "__esModule", { value: true }), mod);
var abilities_exports = {};
__export(abilities_exports, {
  Abilities: () => Abilities
});
module.exports = __toCommonJS(abilities_exports);
const Abilities = {
  cutecharm: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"]) {
        if (this.randomChance(1, 3)) {
          source.addVolatile("attract", target);
        }
      }
    }
  },
  effectspore: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"] && !source.status) {
        const r = this.random(300);
        if (r < 10) {
          source.setStatus("slp", target);
        } else if (r < 20) {
          source.setStatus("par", target);
        } else if (r < 30) {
          source.setStatus("psn", target);
        }
      }
    }
  },
  flamebody: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"]) {
        if (this.randomChance(1, 3)) {
          source.trySetStatus("brn", target);
        }
      }
    }
  },
  flashfire: {
    inherit: true,
    onTryHit(target, source, move) {
      if (target !== source && move.type === "Fire") {
        if (move.id === "willowisp" && (target.hasType("Fire") || target.status || target.volatiles["substitute"])) {
          return;
        }
        if (target.status === "frz") {
          return;
        }
        if (!target.addVolatile("flashfire")) {
          this.add("-immune", target, "[from] ability: Flash Fire");
        }
        return null;
      }
    }
  },
  intimidate: {
    inherit: true,
    onStart(pokemon) {
      let activated = false;
      for (const target of pokemon.adjacentFoes()) {
        if (!target.volatiles["substitute"]) {
          activated = true;
          break;
        }
      }
      if (!activated) {
        this.hint("In Gen 3, Intimidate does not activate if every target has a Substitute.", false, pokemon.side);
        return;
      }
      this.add("-ability", pokemon, "Intimidate", "boost");
      for (const target of pokemon.adjacentFoes()) {
        if (target.volatiles["substitute"]) {
          this.add("-immune", target);
        } else {
          this.boost({ atk: -1 }, target, pokemon, null, true);
        }
      }
    }
  },
  lightningrod: {
    onFoeRedirectTarget(target, source, source2, move) {
      if (move.type !== "Electric")
        return;
      if (this.validTarget(this.effectState.target, source, move.target)) {
        return this.effectState.target;
      }
    },
    isBreakable: true,
    name: "Lightning Rod",
    rating: 0,
    num: 32
  },
  minus: {
    inherit: true,
    onModifySpA(spa, pokemon) {
      for (const active of this.getAllActive()) {
        if (!active.fainted && active.hasAbility("plus")) {
          return this.chainModify(1.5);
        }
      }
    }
  },
  plus: {
    inherit: true,
    onModifySpA(spa, pokemon) {
      for (const active of this.getAllActive()) {
        if (!active.fainted && active.hasAbility("minus")) {
          return this.chainModify(1.5);
        }
      }
    }
  },
  poisonpoint: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"]) {
        if (this.randomChance(1, 3)) {
          source.trySetStatus("psn", target);
        }
      }
    }
  },
  pressure: {
    inherit: true,
    onStart(pokemon) {
      this.addSplit(pokemon.side.id, ["-ability", pokemon, "Pressure", "[silent]"]);
    }
  },
  raindish: {
    inherit: true,
    onWeather() {
    },
    onResidualOrder: 10,
    onResidualSubOrder: 3,
    onResidual(pokemon) {
      if (["raindance", "primordialsea"].includes(pokemon.effectiveWeather())) {
        this.heal(pokemon.baseMaxhp / 16);
      }
    }
  },
  roughskin: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"]) {
        this.damage(source.baseMaxhp / 16, source, target);
      }
    }
  },
  shadowtag: {
    inherit: true,
    onFoeTrapPokemon(pokemon) {
      pokemon.trapped = true;
    }
  },
  static: {
    inherit: true,
    onDamagingHit(damage, target, source, move) {
      if (damage && move.flags["contact"]) {
        if (this.randomChance(1, 3)) {
          source.trySetStatus("par", target);
        }
      }
    }
  },
  trace: {
    inherit: true,
    onUpdate(pokemon) {
      if (!pokemon.isStarted)
        return;
      const target = pokemon.side.randomFoe();
      if (!target || target.fainted)
        return;
      const ability = target.getAbility();
      const bannedAbilities = ["forecast", "multitype", "trace"];
      if (bannedAbilities.includes(target.ability)) {
        return;
      }
      if (pokemon.setAbility(ability)) {
        this.add("-ability", pokemon, ability, "[from] ability: Trace", "[of] " + target);
      }
    }
  },
  truant: {
    inherit: true,
    onStart() {
    },
    onSwitchIn(pokemon) {
      pokemon.truantTurn = this.turn !== 0;
    },
    onBeforeMove(pokemon) {
      if (pokemon.truantTurn) {
        this.add("cant", pokemon, "ability: Truant");
        return false;
      }
    },
    onResidualOrder: 27,
    onResidual(pokemon) {
      pokemon.truantTurn = !pokemon.truantTurn;
    }
  },
  voltabsorb: {
    inherit: true,
    onTryHit(target, source, move) {
      if (target !== source && move.type === "Electric" && move.id !== "thunderwave") {
        if (!this.heal(target.baseMaxhp / 4)) {
          this.add("-immune", target, "[from] ability: Volt Absorb");
        }
        return null;
      }
    }
  }
};
//# sourceMappingURL=abilities.js.map