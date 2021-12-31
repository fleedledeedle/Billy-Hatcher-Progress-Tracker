package data;

public class GameDataLookup {
	public static final int MAX_EMBLEMS = 60;
	
	public static final int MAX_LEVELS = 56;
	public static final int MAX_SRANKS = 56;
	public static final int MAX_CHICK_COINS = 280;
	public static final int MAX_EGGS = 72;
	
	public static final int LEVELS_PER_WORLD = 8;

	private static final String[] worldNames = {
			"Forest Village",
			"Pirates Island",
			"Dino Mountain",
			"Blizzard Castle",
			"Circus Park",
			"Sand Ruin",
			"Giant Palace"
	};
	private static final String[] levelNames = {
			"Save chicken elder Oma-Oma!",
			"Defeat Era Gecko!",
			"Secret little forest hut",
			"Traveling mini game salesman",
			"Secret inside the waterfall",
			"Secret of the windmill!",
			"Save the 8 chickens!",
			"Defeat 100 crows!",
			"Save chicken elder Uri-Uri!",
			"Hurry to the pirate ship!",
			"Race against King Clippen!",
			"Save Rolly!",
			"Treasure in the captain's room!",
			"Defeat 100 Crows!",
			"Chick and the games salesman!",
			"Save the 8 chickens!",
			"Save Chicken Elder Ura-Ura!",
			"Defeat the 3 bone dragons!",
			"Defeat 100 Crows!",
			"Chick has been kidnapped!",
			"Save the 8 chickens!",
			"The travelling games salesman",
			"Battle race! Champion Runny!",
			"Get to the mountaintop!",
			"Rescue chicken elder Ponee!",
			"Secret of ice castle!",
			"After the blizzard...",
			"Save Bantam!",
			"Save the 8 chickens!",
			"Race against Queen Rabbish!",
			"Makin' money with mini-games!",
			"Defeat 100 crows!",
			"Save Chicken Elder Allani!",
			"Secret of the fun house!",
			"The clock stands still...",
			"The caged crow and the emblem!",
			"Fireworks party!",
			"Save the 8 chickens!",
			"Defeat 100 crows!",
			"Win a prize from the game man!",
			"The secret of the giant egg!",
			"Defeat Dark Corvo!",
			"Open the Rainbow Gate!",
			"Even more mini games!",
			"Save the 8 chickens!",
			"Sand Ruins under attack!",
			"Emblem atop the pillar!",
			"Race against King Biboo!",
			"Showdown with Dark Raven!",
			"Deep inside the temple...",
			"Roll down the long slope!",
			"Death match! Get the crows!",
			"Save the 8 chickens!",
			"Climb up the hill!",
			"What's the Game Man doing here?",
			"Last battle! Crow army!"
	};
	public static final String getWorldName(int worldID) { return worldNames[worldID]; }
	public static final String getLevelName(int levelID) { return levelNames[levelID]; }
	public static final String getFullLevelName(int levelID) { return getWorldName(levelID/8) + " "+((levelID%8)+1)+" - " + getLevelName(levelID); }
	
	private static final String[] eggNames = {
			"Fire Comb",
			"Water Comb",
			"Lightning Comb",
			"Ice Comb",
			"Wind Comb",
			"Iron Comb",
			"Light Comb",
			"Wings",
			"Booster",
			"Paraloop",
			"Thorn Egg",
			"Speed Shoes",
			"Bomb",
			"Spring Shoes",
			"Circus Hat",
			"Psychic Hat",
			"Heart Hat",
			"Bat",
			"Crow",
			"Cipher",
			"Clippen",
			"Recky",
			"Richie",
			"Peliwan",
			"Runny",
			"Rabbish",
			"Rikol",
			"Kaboot",
			"Datch",
			"Glarin",
			"Baskus",
			"Oritta",
			"Biboo",
			"Gorilla",
			"Chameleon",
			"Mouse",
			"Turtle",
			"Lion",
			"Dice",
			"Super Fruit",
			"Tiger",
			"Sheep",
			"Hawk",
			"Fox",
			"Large Butterfly",
			"Stopwatch",
			"Small Butterfly",
			"1 Up",
			"Chick Bomb",
			"Egg Bomb",
			"Game Boy Advance Game: Chu Chu Rocket Challenge",
			"Game Boy Advance Game: Nights Score Attack",
			"Game Boy Advance Game: Billy Hatcher Shoot - Easy",
			"Game Boy Advance Game: Billy Hatcher Hyper Shoot",
			"Game Boy Advance Game: Puyo Pop",
			"Sonic",
			"Tails",
			"Knuckles",
			"Chao",
			"Rappy",
			"Kapu Kapu",
			"NIGHTS",
			"Amigo",
			"Super Clippen",
			"Super Recky",
			"Chicken Suit",
			"Oma-Oma",
			"Uri-Uri",
			"Ura-Ura",
			"Ponee",
			"Allani",
			"Mera-Mera"
	};
	public static final String getEggName(int eggID) { return eggNames[eggID]; }

	private static final int[][] eggsInLevels = {
			new int[]{19, 40, 44, 47, 58, 65, 66},
			new int[]{4, 19, 20, 33, 46, 47},
			new int[]{0, 1, 10, 19, 20, 34, 46, 47},
			new int[]{47},
			new int[]{14, 19, 20, 22, 46, 47},
			new int[]{0, 2, 4, 7, 15, 19, 20, 21, 22, 44, 46},
			new int[]{3, 19, 20, 21, 22, 27, 34, 43, 45, 46, 47},
			new int[]{12, 19, 21, 22, 33, 37, 38, 44, 46, 47, 48, 57},
			new int[]{0, 19, 21, 46, 47, 67},
			new int[]{3, 20, 21, 22, 34, 46, 48, 50},
			new int[]{},
			new int[]{1, 20, 22, 37, 46, 47, 48},
			new int[]{0, 14, 19, 24, 36, 46, 47, 60},
			new int[]{5, 15, 19, 20, 21, 22, 37, 44, 46, 47, 48},
			new int[]{11},
			new int[]{1, 8, 12, 14, 19, 20, 24, 27, 44, 45, 46, 47, 48, 63},
			new int[]{5, 19, 20, 21, 46, 68},
			new int[]{4, 20, 22, 23, 33, 34, 42, 44, 47, 53},
			new int[]{0, 10, 19, 20, 21, 23, 24, 37, 44, 46, 48, 55},
			new int[]{6, 20, 21, 22, 23, 36, 46},
			new int[]{7, 16, 19, 20, 22, 24, 26, 33, 34, 37, 45, 46, 48},
			new int[]{},
			new int[]{},
			new int[]{19, 20, 22, 24, 29, 38, 41, 43, 44, 47, 49},
			new int[]{5, 19, 20, 22, 29, 39, 46, 69},
			new int[]{19, 30, 42, 44, 59},
			new int[]{54},
			new int[]{2, 19, 21, 22, 23, 44, 48},
			new int[]{1, 8, 18, 19, 20, 22, 23, 28, 31, 33, 45, 46, 49, 64},
			new int[]{},
			new int[]{11},
			new int[]{3, 15, 19, 23, 30, 31, 34, 40, 46, 48},
			new int[]{0, 7, 19, 20, 31, 44, 46, 70},
			new int[]{19, 20, 32, 37, 47, 51},
			new int[]{21, 30},
			new int[]{13, 21, 23, 31, 46, 49, 62},
			new int[]{10, 20, 21, 22, 32, 46, 47},
			new int[]{0, 11, 17, 19, 20, 23, 28, 30, 31, 45, 46, 48},
			new int[]{3, 10, 12, 15, 22, 24, 30, 37, 46, 47},
			new int[]{},
			new int[]{0, 17, 23, 25, 30, 31, 35, 39, 46, 49, 71},
			new int[]{3, 16, 18, 19, 20, 22, 23, 25, 33, 46, 53},
			new int[]{4, 20, 21, 23, 32, 31, 37, 39, 44},
			new int[]{},
			new int[]{2, 14, 16, 19, 20, 23, 30, 40, 45, 46, 49, 56},
			new int[]{2, 9, 19, 23, 25, 26, 34, 41, 46, 49},
			new int[]{13, 19, 20, 21, 30, 38, 46},
			new int[]{},
			new int[]{5, 19, 20, 22, 25, 44},
			new int[]{0, 22, 25, 29, 31, 36, 41, 48},
			new int[]{1, 3, 18, 21, 32, 34, 46},
			new int[]{12, 16, 17, 19, 20, 25, 30, 31, 37, 41, 46, 48, 61},
			new int[]{2, 6, 7, 19, 22, 24, 25, 45, 46, 48},
			new int[]{4, 22, 25, 30, 46, 48, 49},
			new int[]{},
			new int[]{5, 6, 19, 20, 22, 25, 30, 33, 46, 48}
	};
	
	public static final int[] getEggsInLevel(int levelID) { return eggsInLevels[levelID]; }
	
	private static final int[][] eggLocations = {
			new int[]{2, 5, 8, 12, 18, 32, 37, 40, 49},
			new int[]{2, 11, 15, 28, 50},
			new int[]{5, 27, 44, 45, 52},
			new int[]{6, 9, 31, 38, 41, 50},
			new int[]{1, 5, 17, 42, 53},
			new int[]{13, 16, 24, 48, 55},
			new int[]{19, 52, 55},
			new int[]{5, 20, 40, 52},
			new int[]{15, 28},
			new int[]{45},
			new int[]{2, 18, 36, 38},
			new int[]{14, 30, 45},
			new int[]{7, 15, 38, 51},
			new int[]{35, 46},
			new int[]{4, 12, 15, 44},
			new int[]{5, 13, 31, 38},
			new int[]{20, 41, 44, 51},
			new int[]{37, 40, 51},
			new int[]{28, 42, 50},
			new int[]{},//egg #20 Cipher
			new int[]{},//egg #21 Clippen
			new int[]{},//egg #22 Recky
			new int[]{},//egg #23 Richie
			new int[]{},//egg #24 Peliwan
			new int[]{},//egg #25 Runny
			new int[]{},//egg #26 Rabbish
			new int[]{20, 45},
			new int[]{6, 15},
			new int[]{28, 37},
			new int[]{23, 24, 49},
			new int[]{},//egg #31 Boskus
			new int[]{},//egg #32 Oritta
			new int[]{},//egg #33 Biboo
			new int[]{},//egg #34 Gorilla
			new int[]{},//egg #35 Chameleon
			new int[]{40},
			new int[]{12, 19, 49},
			new int[]{},//egg #38 Lion
			new int[]{7, 23, 46},
			new int[]{24, 40, 42},
			new int[]{0, 31, 44},
			new int[]{23, 45, 49, 51},
			new int[]{17, 25},
			new int[]{6, 23},
			new int[]{},//egg #45 Big Butterfly
			new int[]{6, 15, 20, 28, 35, 44, 52},
			new int[]{},//egg #47 Small Butterfly
			new int[]{},//egg #48 1-up
			new int[]{},//egg #49 Chick Bomb
			new int[]{23, 28, 35, 40, 41, 45, 53},
			new int[]{9},
			new int[]{33},
			new int[]{17},
			new int[]{41},
			new int[]{26},
			new int[]{18},
			new int[]{44},
			new int[]{7},
			new int[]{0},
			new int[]{25},
			new int[]{12},
			new int[]{51},
			new int[]{35},
			new int[]{15},
			new int[]{28},
			new int[]{0},
			new int[]{0},
			new int[]{8},
			new int[]{16},
			new int[]{24},
			new int[]{32},
			new int[]{40}
	};
	
	public static final int[] getEggLocations(int eggID) { return eggLocations[eggID]; }
	
	public static final String[][] chickCoinNotes = {
			new String[]{"Coin beside chick after first gate",
				"Coin on right before slide to gold egg",
				"Coin on slide to gold egg",
				"Coin in bush after gold egg",
				"Coin launching off edge towards butterfly"},
			new String[]{"Coin by giant bee death zone",
				"Coin on slide (left side of egg)",
				"Coin after 8 cats hoop jump to platform",
				"Coin in third box past green hoop",
				"Coin in bush behind boss gate"},
			new String[]{"Coin on top after bee",
				"Coin to the left corner after breaking wall",
				"Coin by switch to right after leaving wall area",
				"Coin in box at top by emblem",
				"Coin jump from top back down to bottom"},
			new String[]{"Coin in bush directly to right of salesman",
				"Coin in haystack beside first gate (left stack)",
				"Coin left corner before heading to switch in 1-1",
				"Coin at base of that platform", 
				"Coin at 1-1 spawn"},
			new String[]{"Coin as you enter river",
				"Coin on right side of river",
				"Coin on middle of river",
				"Coin in far right corner after rapids",
				"Coin in directly left corner of that coin"},
			new String[]{"Coin ontop after wings",
				"Coin box in first room",
				"Coin on slide (left side of egg)",
				"Coin to right after leaving 3 cat room",
				"Coin behind small windmill where chicken suit ws in 1-1"},
			new String[]{"Coin right behind when start",
				"Coin after opening windmill",
				"Coin around gate on top before slide",
				"Coin above chicken after slide",
				"Coin at very top at 1-5 start"},
			new String[]{"Coin jumping off edge after 3 cats in wood",
				"Coin to right after opening gate before slide",
				"Coin on slide",
				"Coin in right haystack as 1-1",
				"Coin in air by emblem platform"},
			new String[]{"Coin on slide (right side)",
				"Coin above stone pillar (take right blue hoop)",
				"Coin behind flames",
				"Coin after blue hoop beside metal thing",
				"Coin round side after cherry and pineapple at end of level"},
			new String[]{"Coin after slide on right",
				"Coin on slide after cannon 1",
				"Coin in box after jumping down from penguins",
				"Coin jumping from end of cove down",
				"Coin in Box before double cannon up top"},
			new String[]{"Coin by triple barriers at start",
				"Coin after jumping back down onto gba egg location",
				"Coin after first green hoop",
				"Coin on slide",
				"Coin above Rock barriers to right after slide"},
			new String[]{"Coin in box to right of 3 enemies at start",
				"Coin where cannon 2 would be (frog)",
				"Coin on slide after Coin 2 (small egg)",
				"Coin in left box on left",
				"Coin on slide to rolly"},
			new String[]{"Coin above green hoops at beginning",
				"Coin during anchors",
				"Coin using circus hat in water after anchors",
				"Coin off edge of switch (treasure island)",
				"Coin in emblem room"},
			new String[]{"Coin on 2-5 switch platform",
				"Coin cannon to flag 1",
				"Coin on slide directly after that",
				"Coin cannon 2 (aim so the barrier is barely in view)",
				"Coin in corner away from gate with penguins"},
			new String[]{"Coin on slide (right side of egg)",
				"Coin by corner on right as off slide",
				"Coin by anchors",
				"Coin on slide up to rolly",
				"Coin on left after flag hit"},
			new String[]{"Coin in treasure area, Pirate 5 Switch platform",
				"Coin circus hat in treasure area",
				"Coin by chick 3 left jump back",
				"Coin during jump down to below glur",
				"Coin in water with circus hat/booster off edge at below part"},
			new String[]{"Coin in boxes to left of golden egg",
				"Coin over lava after golden egg",
				"Coin in corner beside golden egg bounce round",
				"Coin where chick is",
				"Coin bouncing on platforms by flame shooters"},
			new String[]{"Coin behind you",
				"Coin on slide (Left side of egg)",
				"Coin underneath 2nd dragon",
				"Coin behind after tree boost",
				"Coin after 3rd dragon"},
			new String[]{"Coin over lava",
				"Coin beside tree before green hoop",
				"Coin at left in dino head after blue hoop",
				"Coin above handholds where richie boulder would be",
				"Coin above yellow hoop heading to emblem"},
			new String[]{"Coin jumping down first slope",
				"Coin in boxes where gold egg was",
				"Coin past caged green hoop",
				"Coin in boxes to right after picking up egg",
				"Coin after egg roll round gate"},
			new String[]{"Coin in first dino head to left",
				"Coin after first chicken on platforms",
				"Coin on slide (left side)",
				"Coin on platform after jumping from top down to chicken",
				"Coin in middle hole from top"},
			new String[]{"Coin to right in stones",
				"Coin above handholds, restart",
				"Coin uptop on platform",
				"Coin in corner on dino area",
				"Coin in corner by 3-1 golden egg platform"},
			new String[]{"Coin in corner to right after jumping lava",
				"Coin after blue hoops over flame",
				"Coin in rock to right below chick platform",
				"Coin in boxes after jumping round gate",
				"Coin Back towards 3-2 beginning"},
			new String[]{"Coin in furthest right box ahead after skipping slide",
				"Coin jumping off from up top into lower area (hatch clippen)",
				"Coin after third green hoop after clippen",
				"Coin on ledge jump down on way to third dino",
				"Coin Jump off top down to chicken location"},
			new String[]{"Coin on slide to right (platform)",
				"Coin on slide after penguin",
				"Coin down by bantam skip",
				"Coin by tree by Green fire hoop",
				"Coin on final slide by big fruit, (left side of egg)"},
			new String[]{"Coin to right after first gate",
				"Coin on slide (hold left side of egg)",
				"Coin after switch",
				"Coin above platform after cipher egg",
				"Coin on top killing 3rd windmill"},
			new String[]{"Coin in boxes by GBA Egg",
				"Coin jumping back down to cat",
				"Coin just before snowball",
				"Coin on top of barrier just before spikes",
				"Coin in snowman with big cat"},
			new String[]{"Coin down slide at beginning",
				"Coin at red rail",
				"Coin above middle platform by snake",
				"Coin below electric comb",
				"Coin by penguins (fire hoop)(Jump down)"},
			new String[]{"Coin after first chicken to left",
				"Coin at Datch egg after 2nd chicken (box)",
				"Coin after getting super recky chicken",
				"Coin ontop of chicken cage",
				"Coin to right after switch to 4-4 start"},
			new String[]{"Coin on blue rail",
				"Coin jump off blue rail",
				"Coin in center of platform down there (restart)",
				"Coin on slide (rght side) (hold left egg)",
				"Coin back on bantam beginning green hoop"},
			new String[]{"Coin in first snowman beside salesman",
				"Coin jumping back after up slide before smash glass",
				"Coin on slide (left side of egg) (Right side of slide)",
				"Coin after slide to the left in corner",
				"Coin jump off ramp up to snowman platform"},
			new String[]{"Coin in box directly ahead of start",
				"Coin above egg around corner (3 cat killer)",
				"Coin down slide back to 4-4 start",
				"Coin in box before last coin",
				"Coin off edge where stopwatch was"},
			new String[]{"Coin off edge from 5-2 boss gate platform",
				"Coin by red barrels at penguins before gold egg",
				"Coin after first rail, behind you",
				"Coin jumping off just before switchboard",
				"Coin on switch by pineapple and melons up top"},
			new String[]{"Coin above switch 2 for opening funhouse",
				"Coin with GBA egg in cage",
				"Coin in boxes by banana (first mirror)",
				"Coin in corner after 3 switch cage room",
				"Coin at 5-1 beginning"},
			new String[]{"Coins on slide (Slide w/o egg)",
				"Coin on slide (Slide w/o egg)",
				"Coin in box b 2nd electric battery",
				"Coin on slide (hold right egg)",
				"Coin jump on slide (be careful jump halfway through X)"},
			new String[]{"Coin on top of cage",
				"Coin on slide after egg",
				"Coin on blue rail",
				"Coin on slide up with hoops",
				"Coin inbetween 4 green hoops in sky"},
			new String[]{"Coin by red rails (launch right)",
				"Coin by switch not blue rail side",
				"Coin in first box ahead on left side (jump down like any%)",
				"Coin in cage with cannon",
				"Coin at 5-2 start (restart after)"},
			new String[]{"Coin on left side of chicken 1 in cage",
				"Coin on top of enemy cages by chick 2",
				"Coin on slide down to minigame start",
				"Coin in gate after switchboard",
				"Coin above yellow pointer hoop after slide"},
			new String[]{"Coin in box to right of slide",
				"Coin jump back after Cage green hoop",
				"Coin above first switch in 5-2",
				"Coin jump back to 5-2 start",
				"Coin on slide down to loads of crows (SMALL EGG)"},
			new String[]{"Coin behind in box",
				"Coin on slide (slide w/o egg)",
				"Coin in box at bottom of slide (right box)",
				"Coin above battery before red coins",
				"Coin above right side three box pillar"},
			new String[]{"Coin in pot to left of start (middle)",
				"Coin behind where final chicken is",
				"Coin jump down to right off of first step",
				"Coin  down, to left, slide down",
				"Coin off edge of ramp where chicken would be"},
			new String[]{"Coin on slide (small egg)",
				"Coin to right instead of left for first switch",
				"Coin after leaving underground on top",
				"Coin jump back on third platform in underground 2",
				"Coin by Statue in fog room"},
			new String[]{"Coin on underground door (unopened)",
				"Coin round back at corner after leaving underground",
				"Coin on first green hooop jump",
				"Coin end of slide",
				"Coin at 6-1 start"},
			new String[]{"Coin jump right from salesman",
				"Coin in pot to right of 6-3 door to emblem",
				"Coin jump off step into lower area",
				"Coin in lower area on left two after 6-1 start",
				"Coin above green hoop at 6-1 start"},
			new String[]{"Coin at first corner of going up pyramid (circus hat on clippen egg)",
				"Coin in gap of final platform and one before (small egg)",
				"Coin underneath bridge like thing straight ahead",
				"Coin right and by pillar",
				"Coin hopped on sonic, behind next platform to right"},
			new String[]{"Coin at end of first platform jumped to",
				"Coin in vase furthest corner on final platform",
				"Coin at right side to climb pyramid",
				"Coin behind green hoop to climb to second pyramid level",
				"Coin behind top green hoop before emblem"},
			new String[]{"Coin to left behind on rail",
				"Coin on slope on 6-3 start",
				"Coin off cage on next platform",
				"Coin in box by sign bounce",
				"Coin jump off emblem platform"},
			new String[]{"Coin in farthest pot behind biboo",
				"Coin behind third pillar after skip to top",
				"Coin off edge after pillars, roll back",
				"Coin when gone right instead of left to climb pyramid",
				"Coin above double shooters going left at top"},
			new String[]{"Coin at rabbish gate in break bush",
				"Coin in air jumping down to switch after puddles",
				"Coin in corner after after crow room",
				"Coin on slide (left side of egg)",
				"Coin at top jump down top bottom before heading to portal"},
			new String[]{"Coin to right of glarin egg",
				"Coin behind after jumping out window we skip with",
				"Coin on thin walkway jump",
				"Coin on jump to last platform",
				"Coin in last room before emblem to right of door (esb)"},
			new String[]{"Coin at green top statue skip off to right",
				"Coin just after chameleon egg jump",
				"Coin on slide",
				"Coin on slide (restart after)",
				"Coin jump down from platform to bottom"},
			new String[]{"Coin to left of first gate",
				"Coin in box above second 2nd puddle",
				"Coin on railing before rails down to 7-1 finish",
				"Coin on slide (left side of egg)",
				"Coin up second route across 7-1 skip area"},
			new String[]{"Coin left of egg in pot",
				"Coin on jump to platform with pink chicken",
				"Coin dashing forward, coin on right platform",
				"Coin during jump from 7-2 start down to thin rail",
				"Coin during jump from dark raven platform back down"},
			new String[]{"Coin on slide",
				"Coin on slide",
				"Coin at end of slide",
				"Coin to left of green grass on pillar",
				"Coin on last jump to emblem pillar"},
			new String[]{"Coin on railing before rabbish coin (start minigame now)",
				"Coin jump down after puddles (big egg on red coin take small)",
				"Coin on railing after hoop after invisible switch room",
				"Coin in center back of platform before slide",
				"Coin is on right hand side by first pillar you use to climb to top (skip slide)"},
			new String[]{"Coin in center of first room",
				"Coin from yellow hoop backwards after second room",
				"Coin during jump across to switch for door",
				"Coin in front of switch for room with enemies",
				"Coin on railing before slide down"}
	};
}
