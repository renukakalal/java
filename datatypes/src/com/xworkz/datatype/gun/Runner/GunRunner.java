package com.xworkz.datatype.gun.Runner;

import com.xworkz.datatype.gun.things.Dboss;
import com.xworkz.datatype.gun.things.Godse;
import com.xworkz.datatype.gun.things.Gun;
import com.xworkz.datatype.gun.things.Police;
import com.xworkz.datatype.gun.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Soldier soldier = new Soldier();
			soldier.shoot();

			Police police = new Police();
			Gun gun = new Gun("AK-47", "India", "Rifle");
			police.carryGun(gun);

			Gun gun1 = new Gun("M16", "USA", "Assault Rifle");
			Dboss dboss = new Dboss(gun1);
			dboss.showGun();

			Godse godse = new Godse();
			Gun ref = godse.getGun();
			if (ref != null) {
				ref.fire();
				ref.display();
			} else {
				System.out.println("ref is null");
			}

		}

	

	}


