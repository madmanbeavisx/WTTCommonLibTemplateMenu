package org.madmanbeavis.wttcommonlibtemplatemenu.templates

data class TemplateCategory(val name: String, val templates: Map<String, String>)

object TemplateManager {
    private val categories = linkedMapOf(
        "Bot" to mapOf(
            "Bot Loadout" to createCustomBotLoadout()
        ),
        "Clothing" to mapOf(
            "Clothing" to createCustomClothing(),
            "Head" to createCustomHead()
        ),
        "Item" to mapOf(
            "Item Config" to createCustomItemConfig()
        ),
        "Quest" to mapOf(
            "Quest Side" to createCustomQuestSide(),
            "Quest Time Window" to createCustomQuestTimeWindow(),
            "Quest Zone" to createCustomQuestZone()
        ),
        "Spawn" to mapOf(
            "Spawn Config" to createCustomSpawnConfig()
        ),
        "Voice" to mapOf(
            "Voice Config" to createCustomVoiceConfig()
        )
    )

    fun getCategories(): List<String> = categories.keys.toList()

    fun getTemplatesForCategory(category: String): Map<String, String>? = categories[category]

    fun getTemplate(category: String, templateName: String): String? =
        categories[category]?.get(templateName)

    private fun createCustomBotLoadout() = """
        {
          "chances": {
            "equipment": {
              "Headwear": 0.5,
              "Earpiece": 0.3,
              "TacticalVest": 0.8
            },
            "weaponMods": {
              "mod_scope": 0.4,
              "mod_foregrip": 0.6
            },
            "equipmentMods": {
              "mod_nvg": 0.2
            }
          },
          "inventory": {
            "equipment": {
              "Headwear": {
                "item_id_1": 0.5,
                "item_id_2": 0.5
              }
            },
            "mods": {
              "weapon_id": {
                "mod_scope": ["scope_id_1", "scope_id_2"]
              }
            },
            "Ammo": {
              "caliber_556": {
                "ammo_id_1": 0.7,
                "ammo_id_2": 0.3
              }
            }
          },
          "appearance": {
            "body": {
              "body_id_1": 0.5,
              "body_id_2": 0.5
            },
            "feet": {
              "feet_id_1": 1.0
            },
            "hands": {
              "hands_id_1": 1.0
            },
            "head": {
              "head_id_1": 0.5,
              "head_id_2": 0.5
            },
            "voice": {
              "voice_id_1": 0.5,
              "voice_id_2": 0.5
            }
          }
        }
    """.trimIndent()

    private fun createCustomClothing() = """
        {
          "type": "top",
          "suiteId": "custom_suite_001",
          "outfitId": "custom_outfit_001",
          "topId": "custom_top_001",
          "handsId": "custom_hands_001",
          "bottomId": null,
          "side": ["usec", "bear"],
          "locales": {
            "en": {
              "name": "Custom Tactical Jacket",
              "description": "A custom tactical jacket with enhanced durability"
            }
          },
          "topBundlePath": "path/to/top/bundle",
          "handsBundlePath": "path/to/hands/bundle",
          "bottomBundlePath": null,
          "traderId": "54cb50c76803fa8b248b4571",
          "loyaltyLevel": 2,
          "profileLevel": 15,
          "standing": 0.25,
          "currencyId": "5449016a4bdc2d6f028b456f",
          "price": 50000,
          "watchPrefab": null,
          "watchPosition": null,
          "watchRotation": null,
          "skillRequirements": [],
          "questRequirements": [],
          "achievementRequirements": []
        }
    """.trimIndent()

    private fun createCustomHead() = """
        {
          "path": "path/to/head/bundle",
          "addHeadToPlayer": true,
          "side": ["usec", "bear"],
          "locales": {
            "en": "Custom Head Model"
          }
        }
    """.trimIndent()

    private fun createCustomItemConfig() = """
        {
          "itemTplToClone": "5447a9cd4bdc2dbd208b4567",
          "parentId": "5447b5cf4bdc2d65278b4567",
          "handbookParentId": "5b47574386f77428ca22b33e",
          "overrideProperties": {
            "_id": "custom_item_001",
            "_name": "custom_item_name",
            "_props": {}
          },
          "locales": {
            "en": {
              "name": "Custom Item",
              "shortName": "CI",
              "description": "A custom item for testing purposes"
            }
          },
          "fleaPriceRoubles": 25000,
          "handbookPriceRoubles": 20000,
          "addtoInventorySlots": ["Backpack", "Pockets"],
          "addtoModSlots": false,
          "modSlot": null,
          "addtoTraders": true,
          "traders": {
            "54cb50c76803fa8b248b4571": {
              "scheme_001": {
                "barterSettings": {
                  "loyalLevel": 1,
                  "unlimitedCount": false,
                  "stackObjectsCount": 1,
                  "buyRestrictionMax": 3
                },
                "barters": [
                  {
                    "count": 15000,
                    "_tpl": "5449016a4bdc2d6f028b456f",
                    "onlyFunctional": false,
                    "sptQuestLocked": false,
                    "level": null,
                    "side": null
                  }
                ]
              }
            }
          },
          "addtoBots": true,
          "addtoStaticLootContainers": true,
          "staticLootContainers": [
            {
              "containerName": "weapon_box",
              "probability": 10
            }
          ],
          "masteries": false,
          "masterySections": null,
          "addWeaponPreset": false,
          "weaponPresets": null,
          "addtoHallOfFame": false,
          "hallOfFameSlots": null,
          "addtoSpecialSlots": false,
          "addtoGeneratorAsFuel": false,
          "generatorFuelSlotStages": null,
          "addtoHideoutPosterSlots": false,
          "addPosterToMaps": false,
          "posterSpawnProbability": null,
          "addtoStatuetteSlots": false,
          "addCaliberToAllCloneLocations": false,
          "addtoStaticAmmo": false,
          "staticAmmoProbability": null,
          "addtoEmptyPropSlots": false,
          "emptyPropSlot": null,
          "addtoSecureFilters": false
        }
    """.trimIndent()

    private fun createCustomQuestSide() = """
        {
          "usecOnlyQuests": [
            "quest_usec_001",
            "quest_usec_002"
          ],
          "bearOnlyQuests": [
            "quest_bear_001",
            "quest_bear_002"
          ]
        }
    """.trimIndent()

    private fun createCustomQuestTimeWindow() = """
        {
          "startMonth": 12,
          "startDay": 1,
          "endMonth": 1,
          "endDay": 15
        }
    """.trimIndent()

    private fun createCustomQuestZone() = """
        {
          "zoneId": "custom_zone_001",
          "zoneName": "Custom Quest Zone",
          "zoneLocation": "factory4_day",
          "zoneType": "Place",
          "flareType": "green",
          "position": {
            "x": "100.5",
            "y": "10.0",
            "z": "200.3",
            "w": "0"
          },
          "rotation": {
            "x": "0",
            "y": "90",
            "z": "0",
            "w": "0"
          },
          "scale": {
            "x": "1",
            "y": "1",
            "z": "1",
            "w": "0"
          }
        }
    """.trimIndent()

    private fun createCustomSpawnConfig() = """
        {
          "questId": "custom_quest_001",
          "locationID": "factory4_day",
          "bundleName": "custom_bundle",
          "prefabName": "custom_prefab",
          "position": {
            "x": 100.5,
            "y": 10.0,
            "z": 200.3
          },
          "rotation": {
            "x": 0,
            "y": 90,
            "z": 0
          },
          "requiredQuestStatuses": ["Started", "AvailableForFinish"],
          "excludedQuestStatuses": ["Success"],
          "questMustExist": true,
          "linkedQuestId": "linked_quest_001",
          "linkedRequiredStatuses": ["Success"],
          "linkedExcludedStatuses": [],
          "linkedQuestMustExist": false,
          "requiredItemInInventory": "item_id_123",
          "requiredLevel": 15,
          "requiredFaction": "usec",
          "requiredBossSpawned": "bossKilla"
        }
    """.trimIndent()

    private fun createCustomVoiceConfig() = """
        {
          "locales": {
            "en": "Custom Voice Pack"
          },
          "name": "custom_voice_001",
          "bundlePath": "path/to/voice/bundle",
          "addVoiceToPlayer": true,
          "sideSpecificVoice": ["usec", "bear"],
          "addToBotTypes": {
            "assault": 50,
            "pmcBot": 30
          }
        }
    """.trimIndent()
}
