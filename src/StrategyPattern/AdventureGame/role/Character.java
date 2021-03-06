package StrategyPattern.AdventureGame.role;

import StrategyPattern.AdventureGame.behavior.WeaponBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 角色类（策略模式）
 */

public class Character {
    // 武器行为
    WeaponBehavior weaponBehavior;

    // 设置武器行为
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    // 使用武器进行战斗
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
