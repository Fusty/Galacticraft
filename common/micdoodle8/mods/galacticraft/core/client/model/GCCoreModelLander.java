package micdoodle8.mods.galacticraft.core.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

/**
 * GCCoreModelLander.java
 *
 * This file is part of the Galacticraft project
 *
 * @author micdoodle8
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GCCoreModelLander extends ModelBase
{
    GCCoreModelRenderer BodyMain1;
    GCCoreModelRenderer BodyMain2;
    GCCoreModelRenderer BodyAux1;
    GCCoreModelRenderer BodyAux2;
    GCCoreModelRenderer BodyAux3;
    GCCoreModelRenderer BodyAux4;
    GCCoreModelRenderer BodySupportMain1;
    GCCoreModelRenderer BodySupportMain2;
    GCCoreModelRenderer LegStructureAux1e;
    GCCoreModelRenderer FootBaseg;
    GCCoreModelRenderer LegStructure1i;
    GCCoreModelRenderer LegBase1j;
    GCCoreModelRenderer FootJointk;
    GCCoreModelRenderer FootBasel;
    GCCoreModelRenderer LegBase1n;
    GCCoreModelRenderer LegStructureAux1s;
    GCCoreModelRenderer LegStructure1u;
    GCCoreModelRenderer FootJointv;
    GCCoreModelRenderer FootBasew;
    GCCoreModelRenderer FootBasex;
    GCCoreModelRenderer LegBase1z;
    GCCoreModelRenderer LegStructureAux1f;
    GCCoreModelRenderer LegStructure1g;
    GCCoreModelRenderer FootJointh;
    GCCoreModelRenderer FootBasei;
    GCCoreModelRenderer FootBasej;
    GCCoreModelRenderer LegBase1l;
    GCCoreModelRenderer LegStructureAux1q;
    GCCoreModelRenderer LegStructure1s;
    GCCoreModelRenderer FootJointt;
    GCCoreModelRenderer FootBaseu;
    GCCoreModelRenderer FootBasev;
    GCCoreModelRenderer ModuleMain1;
    GCCoreModelRenderer ModuleMain2;
    GCCoreModelRenderer ModuleMainDeco;
    GCCoreModelRenderer ModuleCore1;
    GCCoreModelRenderer ModuleCore2;
    GCCoreModelRenderer ModuleCore3;
    GCCoreModelRenderer ModuleAux1;
    GCCoreModelRenderer ModuleAux2;
    GCCoreModelRenderer ModuleAux3;
    GCCoreModelRenderer ModuleAux4;
    GCCoreModelRenderer ModuleAux5;
    GCCoreModelRenderer ModuleAux6;
    GCCoreModelRenderer ModuleAux7;
    GCCoreModelRenderer ModuleAux8;
    GCCoreModelRenderer ModuleThrusterBase1;
    GCCoreModelRenderer ModuleThrusterBase2;
    GCCoreModelRenderer ModuleThrusterBase3;
    GCCoreModelRenderer ModuleThrusterBase4;
    GCCoreModelRenderer ModuleThrusterBase5;
    GCCoreModelRenderer ModuleThrusterConeTop1;
    GCCoreModelRenderer ModuleThrusterConeTop2;
    GCCoreModelRenderer ModuleThrusterConeTop3;
    GCCoreModelRenderer ModuleThrusterConeBack1;
    GCCoreModelRenderer ModuleThrusterConeBack2;
    GCCoreModelRenderer ModuleThrusterConeBack3;
    GCCoreModelRenderer ModuleThrusterConeBot1;
    GCCoreModelRenderer ModuleThrusterConeBot2;
    GCCoreModelRenderer ModuleThrusterConeBot3;
    GCCoreModelRenderer ModuleThrusterConeFront1;
    GCCoreModelRenderer ModuleThrusterConeFront2;
    GCCoreModelRenderer ModuleThrusterConeFront3;

    public GCCoreModelLander()
    {
        this.textureWidth = 512;
        this.textureHeight = 512;

        this.BodyMain1 = new GCCoreModelRenderer(this, 125, 128);
        this.BodyMain1.addBox(-24F, 0F, -24F, 48, 12, 48);
        this.BodyMain1.setRotationPoint(0F, 0F, 0F);
        this.BodyMain1.setTextureSize(512, 512);
        this.BodyMain1.mirror = true;
        this.setRotation(this.BodyMain1, 0F, -0.3926991F, 0F);
        this.BodyMain2 = new GCCoreModelRenderer(this, 125, 128);
        this.BodyMain2.addBox(-24F, -0.1F, -24F, 48, 12, 48);
        this.BodyMain2.setRotationPoint(0F, 0F, 0F);
        this.BodyMain2.setTextureSize(512, 512);
        this.BodyMain2.mirror = true;
        this.setRotation(this.BodyMain2, 0F, 0.3926991F, 0F);
        this.BodyAux1 = new GCCoreModelRenderer(this, 125, 192);
        this.BodyAux1.addBox(-13F, -5F, -34F, 26, 15, 34);
        this.BodyAux1.setRotationPoint(0F, 0F, 0F);
        this.BodyAux1.setTextureSize(512, 512);
        this.BodyAux1.mirror = true;
        this.setRotation(this.BodyAux1, 0.0698132F, 0.7853982F, 0F);
        this.BodyAux2 = new GCCoreModelRenderer(this, 125, 192);
        this.BodyAux2.addBox(-13F, -5F, -34F, 26, 15, 34);
        this.BodyAux2.setRotationPoint(0F, 0F, 0F);
        this.BodyAux2.setTextureSize(512, 512);
        this.BodyAux2.mirror = true;
        this.setRotation(this.BodyAux2, 0.0698132F, -0.7853982F, 0F);
        this.BodyAux3 = new GCCoreModelRenderer(this, 125, 192);
        this.BodyAux3.addBox(-13F, -5F, -34F, 26, 15, 34);
        this.BodyAux3.setRotationPoint(0F, 0F, 0F);
        this.BodyAux3.setTextureSize(512, 512);
        this.BodyAux3.mirror = true;
        this.setRotation(this.BodyAux3, 0.0698132F, -2.356194F, 0F);
        this.BodyAux4 = new GCCoreModelRenderer(this, 125, 192);
        this.BodyAux4.addBox(-13F, -5F, -34F, 26, 15, 34);
        this.BodyAux4.setRotationPoint(0F, 0F, 0F);
        this.BodyAux4.setTextureSize(512, 512);
        this.BodyAux4.mirror = true;
        this.setRotation(this.BodyAux4, 0.0698132F, 2.356194F, 0F);
        this.BodySupportMain1 = new GCCoreModelRenderer(this, 125, 243);
        this.BodySupportMain1.addBox(-19F, -7F, -19F, 38, 10, 38);
        this.BodySupportMain1.setRotationPoint(0F, 0F, 0F);
        this.BodySupportMain1.setTextureSize(512, 512);
        this.BodySupportMain1.mirror = true;
        this.setRotation(this.BodySupportMain1, 0F, 0F, 0F);
        this.BodySupportMain2 = new GCCoreModelRenderer(this, 125, 293);
        this.BodySupportMain2.addBox(-12F, -15F, -12F, 24, 15, 24);
        this.BodySupportMain2.setRotationPoint(0F, 0F, 0F);
        this.BodySupportMain2.setTextureSize(512, 512);
        this.BodySupportMain2.mirror = true;
        this.setRotation(this.BodySupportMain2, 0F, 0F, 0F);
        this.LegStructureAux1e = new GCCoreModelRenderer(this, 0, 81);
        this.LegStructureAux1e.addBox(-26F, 28F, -2F, 3, 24, 3);
        this.LegStructureAux1e.setRotationPoint(0F, 0F, 0F);
        this.LegStructureAux1e.setTextureSize(512, 512);
        this.LegStructureAux1e.mirror = true;
        this.setRotation(this.LegStructureAux1e, 0F, -2.356194F, 0.7330383F);
        this.FootBaseg = new GCCoreModelRenderer(this, 125, 81);
        this.FootBaseg.addBox(-64F, 18.9F, -2F, 11, 6, 2);
        this.FootBaseg.setRotationPoint(0F, 0F, 0F);
        this.FootBaseg.setTextureSize(512, 512);
        this.FootBaseg.mirror = true;
        this.setRotation(this.FootBaseg, 0F, -2.356194F, 0F);
        this.LegStructure1i = new GCCoreModelRenderer(this, 0, 0);
        this.LegStructure1i.addBox(-27F, 33F, -3F, 5, 14, 5);
        this.LegStructure1i.setRotationPoint(0F, 0F, 0F);
        this.LegStructure1i.setTextureSize(512, 512);
        this.LegStructure1i.mirror = true;
        this.setRotation(this.LegStructure1i, 0F, -2.356194F, 0.7330383F);
        this.LegBase1j = new GCCoreModelRenderer(this, 16, 81);
        this.LegBase1j.addBox(-29F, 20F, -5F, 9, 10, 9);
        this.LegBase1j.setRotationPoint(0F, 0F, 0F);
        this.LegBase1j.setTextureSize(512, 512);
        this.LegBase1j.mirror = true;
        this.setRotation(this.LegBase1j, 0F, -2.356194F, 0.7330383F);
        this.FootJointk = new GCCoreModelRenderer(this, 64, 104);
        this.FootJointk.addBox(-58F, 20F, -6.5F, 7, 5, 11);
        this.FootJointk.setRotationPoint(0F, 0F, 0F);
        this.FootJointk.setTextureSize(512, 512);
        this.FootJointk.mirror = true;
        this.setRotation(this.FootJointk, 0F, -2.356194F, 0F);
        this.FootBasel = new GCCoreModelRenderer(this, 64, 81);
        this.FootBasel.addBox(-62F, 23F, -8.5F, 10, 2, 15);
        this.FootBasel.setRotationPoint(0F, 0F, 0F);
        this.FootBasel.setTextureSize(512, 512);
        this.FootBasel.mirror = true;
        this.setRotation(this.FootBasel, 0F, -2.356194F, 0F);
        this.LegBase1n = new GCCoreModelRenderer(this, 16, 81);
        this.LegBase1n.addBox(-29F, 20F, -5F, 9, 10, 9);
        this.LegBase1n.setRotationPoint(0F, 0F, 0F);
        this.LegBase1n.setTextureSize(512, 512);
        this.LegBase1n.mirror = true;
        this.setRotation(this.LegBase1n, 0F, -0.7853982F, 0.7330383F);
        this.LegStructureAux1s = new GCCoreModelRenderer(this, 0, 81);
        this.LegStructureAux1s.addBox(-26F, 28F, -2F, 3, 24, 3);
        this.LegStructureAux1s.setRotationPoint(0F, 0F, 0F);
        this.LegStructureAux1s.setTextureSize(512, 512);
        this.LegStructureAux1s.mirror = true;
        this.setRotation(this.LegStructureAux1s, 0F, -0.7853982F, 0.7330383F);
        this.LegStructure1u = new GCCoreModelRenderer(this, 0, 0);
        this.LegStructure1u.addBox(-27F, 33F, -3F, 5, 14, 5);
        this.LegStructure1u.setRotationPoint(0F, 0F, 0F);
        this.LegStructure1u.setTextureSize(512, 512);
        this.LegStructure1u.mirror = true;
        this.setRotation(this.LegStructure1u, 0F, -0.7853982F, 0.7330383F);
        this.FootJointv = new GCCoreModelRenderer(this, 64, 104);
        this.FootJointv.addBox(-58F, 20F, -6.5F, 7, 5, 11);
        this.FootJointv.setRotationPoint(0F, 0F, 0F);
        this.FootJointv.setTextureSize(512, 512);
        this.FootJointv.mirror = true;
        this.setRotation(this.FootJointv, 0F, -0.7853982F, 0F);
        this.FootBasew = new GCCoreModelRenderer(this, 64, 81);
        this.FootBasew.addBox(-62F, 23F, -8.5F, 10, 2, 15);
        this.FootBasew.setRotationPoint(0F, 0F, 0F);
        this.FootBasew.setTextureSize(512, 512);
        this.FootBasew.mirror = true;
        this.setRotation(this.FootBasew, 0F, -0.7853982F, 0F);
        this.FootBasex = new GCCoreModelRenderer(this, 125, 81);
        this.FootBasex.addBox(-64F, 18.9F, -2F, 11, 6, 2);
        this.FootBasex.setRotationPoint(0F, 0F, 0F);
        this.FootBasex.setTextureSize(512, 512);
        this.FootBasex.mirror = true;
        this.setRotation(this.FootBasex, 0F, -0.7853982F, 0F);
        this.LegBase1z = new GCCoreModelRenderer(this, 16, 81);
        this.LegBase1z.addBox(-29F, 20F, -5F, 9, 10, 9);
        this.LegBase1z.setRotationPoint(0F, 0F, 0F);
        this.LegBase1z.setTextureSize(512, 512);
        this.LegBase1z.mirror = true;
        this.setRotation(this.LegBase1z, 0F, 0.7853982F, 0.7330383F);
        this.LegStructureAux1f = new GCCoreModelRenderer(this, 0, 81);
        this.LegStructureAux1f.addBox(-26F, 28F, -2F, 3, 24, 3);
        this.LegStructureAux1f.setRotationPoint(0F, 0F, 0F);
        this.LegStructureAux1f.setTextureSize(512, 512);
        this.LegStructureAux1f.mirror = true;
        this.setRotation(this.LegStructureAux1f, 0F, 0.7853982F, 0.7330383F);
        this.LegStructure1g = new GCCoreModelRenderer(this, 0, 0);
        this.LegStructure1g.addBox(-27F, 33F, -3F, 5, 14, 5);
        this.LegStructure1g.setRotationPoint(0F, 0F, 0F);
        this.LegStructure1g.setTextureSize(512, 512);
        this.LegStructure1g.mirror = true;
        this.setRotation(this.LegStructure1g, 0F, 0.7853982F, 0.7330383F);
        this.FootJointh = new GCCoreModelRenderer(this, 64, 104);
        this.FootJointh.addBox(-58F, 20F, -6.5F, 7, 5, 11);
        this.FootJointh.setRotationPoint(0F, 0F, 0F);
        this.FootJointh.setTextureSize(512, 512);
        this.FootJointh.mirror = true;
        this.setRotation(this.FootJointh, 0F, 0.7853982F, 0F);
        this.FootBasei = new GCCoreModelRenderer(this, 64, 81);
        this.FootBasei.addBox(-62F, 23F, -8.5F, 10, 2, 15);
        this.FootBasei.setRotationPoint(0F, 0F, 0F);
        this.FootBasei.setTextureSize(512, 512);
        this.FootBasei.mirror = true;
        this.setRotation(this.FootBasei, 0F, 0.7853982F, 0F);
        this.FootBasej = new GCCoreModelRenderer(this, 125, 81);
        this.FootBasej.addBox(-64F, 18.9F, -2F, 11, 6, 2);
        this.FootBasej.setRotationPoint(0F, 0F, 0F);
        this.FootBasej.setTextureSize(512, 512);
        this.FootBasej.mirror = true;
        this.setRotation(this.FootBasej, 0F, 0.7853982F, 0F);
        this.LegBase1l = new GCCoreModelRenderer(this, 16, 81);
        this.LegBase1l.addBox(-29F, 20F, -5F, 9, 10, 9);
        this.LegBase1l.setRotationPoint(0F, 0F, 0F);
        this.LegBase1l.setTextureSize(512, 512);
        this.LegBase1l.mirror = true;
        this.setRotation(this.LegBase1l, 0F, 2.356194F, 0.7330383F);
        this.LegStructureAux1q = new GCCoreModelRenderer(this, 0, 81);
        this.LegStructureAux1q.addBox(-26F, 28F, -2F, 3, 24, 3);
        this.LegStructureAux1q.setRotationPoint(0F, 0F, 0F);
        this.LegStructureAux1q.setTextureSize(512, 512);
        this.LegStructureAux1q.mirror = true;
        this.setRotation(this.LegStructureAux1q, 0F, 2.356194F, 0.7330383F);
        this.LegStructure1s = new GCCoreModelRenderer(this, 0, 0);
        this.LegStructure1s.addBox(-27F, 33F, -3F, 5, 14, 5);
        this.LegStructure1s.setRotationPoint(0F, 0F, 0F);
        this.LegStructure1s.setTextureSize(512, 512);
        this.LegStructure1s.mirror = true;
        this.setRotation(this.LegStructure1s, 0F, 2.356194F, 0.7330383F);
        this.FootJointt = new GCCoreModelRenderer(this, 64, 104);
        this.FootJointt.addBox(-58F, 20F, -6.5F, 7, 5, 11);
        this.FootJointt.setRotationPoint(0F, 0F, 0F);
        this.FootJointt.setTextureSize(512, 512);
        this.FootJointt.mirror = true;
        this.setRotation(this.FootJointt, 0F, 2.356194F, 0F);
        this.FootBaseu = new GCCoreModelRenderer(this, 64, 81);
        this.FootBaseu.addBox(-62F, 23F, -8.5F, 10, 2, 15);
        this.FootBaseu.setRotationPoint(0F, 0F, 0F);
        this.FootBaseu.setTextureSize(512, 512);
        this.FootBaseu.mirror = true;
        this.setRotation(this.FootBaseu, 0F, 2.356194F, 0F);
        this.FootBasev = new GCCoreModelRenderer(this, 125, 81);
        this.FootBasev.addBox(-64F, 18.9F, -2F, 11, 6, 2);
        this.FootBasev.setRotationPoint(0F, 0F, 0F);
        this.FootBasev.setTextureSize(512, 512);
        this.FootBasev.mirror = true;
        this.setRotation(this.FootBasev, 0F, 2.356194F, 0F);
        this.ModuleMain1 = new GCCoreModelRenderer(this, 289, 166);
        this.ModuleMain1.addBox(-6F, -44F, -16F, 32, 32, 32);
        this.ModuleMain1.setRotationPoint(0F, 0F, 0F);
        this.ModuleMain1.setTextureSize(512, 512);
        this.ModuleMain1.mirror = true;
        this.setRotation(this.ModuleMain1, 0F, 0F, 0F);
        this.ModuleMain2 = new GCCoreModelRenderer(this, 249, 234);
        this.ModuleMain2.addBox(-16F, -30F, -13F, 32, 16, 26);
        this.ModuleMain2.setRotationPoint(0F, 0F, 0F);
        this.ModuleMain2.setTextureSize(512, 512);
        this.ModuleMain2.mirror = true;
        this.setRotation(this.ModuleMain2, 0F, 0F, 0F);
        this.ModuleMainDeco = new GCCoreModelRenderer(this, 70, 300);
        this.ModuleMainDeco.addBox(16F, -46F, -20.9F, 5, 30, 37);
        this.ModuleMainDeco.setRotationPoint(0F, 0F, 0F);
        this.ModuleMainDeco.setTextureSize(512, 512);
        this.ModuleMainDeco.mirror = true;
        this.setRotation(this.ModuleMainDeco, 0F, 0F, 0F);
        this.ModuleCore1 = new GCCoreModelRenderer(this, 197, 293);
        this.ModuleCore1.mirror = true;
        this.ModuleCore1.addBox(-20F, -48F, -25F, 5, 36, 42);
        this.ModuleCore1.setRotationPoint(0F, 0F, 0F);
        this.ModuleCore1.setTextureSize(512, 512);
        this.ModuleCore1.mirror = true;
        this.setRotation(this.ModuleCore1, 0F, 0F, 0F);
        this.ModuleCore1.mirror = false;
        this.ModuleCore2 = new GCCoreModelRenderer(this, 197, 293);
        this.ModuleCore2.addBox(-30F, -48F, -25F, 5, 36, 42);
        this.ModuleCore2.setRotationPoint(0F, 0F, 0F);
        this.ModuleCore2.setTextureSize(512, 512);
        this.ModuleCore2.mirror = true;
        this.setRotation(this.ModuleCore2, 0F, 0F, 0F);
        this.ModuleCore3 = new GCCoreModelRenderer(this, 295, 300);
        this.ModuleCore3.addBox(-25F, -44F, -21F, 5, 28, 34);
        this.ModuleCore3.setRotationPoint(0F, 0F, 0F);
        this.ModuleCore3.setTextureSize(512, 512);
        this.ModuleCore3.mirror = true;
        this.setRotation(this.ModuleCore3, 0F, 0F, 0F);
        this.ModuleAux1 = new GCCoreModelRenderer(this, 85, 238);
        this.ModuleAux1.addBox(26F, -34F, -13F, 4, 16, 26);
        this.ModuleAux1.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux1.setTextureSize(512, 512);
        this.ModuleAux1.mirror = true;
        this.setRotation(this.ModuleAux1, 0F, 0F, 0F);
        this.ModuleAux2 = new GCCoreModelRenderer(this, 0, 110);
        this.ModuleAux2.addBox(26.1F, -60F, 9F, 1, 28, 1);
        this.ModuleAux2.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux2.setTextureSize(512, 512);
        this.ModuleAux2.mirror = true;
        this.setRotation(this.ModuleAux2, 0F, 0F, 0F);
        this.ModuleAux3 = new GCCoreModelRenderer(this, 17, 110);
        this.ModuleAux3.addBox(27F, -57F, -12F, 1, 23, 1);
        this.ModuleAux3.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux3.setTextureSize(512, 512);
        this.ModuleAux3.mirror = true;
        this.setRotation(this.ModuleAux3, 0F, 0F, 0F);
        this.ModuleAux4 = new GCCoreModelRenderer(this, 5, 110);
        this.ModuleAux4.addBox(28F, -48F, -8F, 1, 14, 1);
        this.ModuleAux4.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux4.setTextureSize(512, 512);
        this.ModuleAux4.mirror = true;
        this.setRotation(this.ModuleAux4, 0F, 0F, 0F);
        this.ModuleAux5 = new GCCoreModelRenderer(this, 5, 110);
        this.ModuleAux5.addBox(28F, -48F, -6F, 1, 14, 1);
        this.ModuleAux5.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux5.setTextureSize(512, 512);
        this.ModuleAux5.mirror = true;
        this.setRotation(this.ModuleAux5, 0F, 0F, 0F);
        this.ModuleAux6 = new GCCoreModelRenderer(this, 5, 110);
        this.ModuleAux6.addBox(28F, -48F, -4F, 1, 14, 1);
        this.ModuleAux6.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux6.setTextureSize(512, 512);
        this.ModuleAux6.mirror = true;
        this.setRotation(this.ModuleAux6, 0F, 0F, 0F);
        this.ModuleAux7 = new GCCoreModelRenderer(this, 11, 110);
        this.ModuleAux7.addBox(27F, -53F, 2F, 1, 19, 1);
        this.ModuleAux7.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux7.setTextureSize(512, 512);
        this.ModuleAux7.mirror = true;
        this.setRotation(this.ModuleAux7, 0F, 0F, 0F);
        this.ModuleAux8 = new GCCoreModelRenderer(this, 0, 110);
        this.ModuleAux8.addBox(28.9F, -60F, 9F, 1, 28, 1);
        this.ModuleAux8.setRotationPoint(0F, 0F, 0F);
        this.ModuleAux8.setTextureSize(512, 512);
        this.ModuleAux8.mirror = true;
        this.setRotation(this.ModuleAux8, 0F, 0F, 0F);
        this.ModuleThrusterBase1 = new GCCoreModelRenderer(this, 21, 19);
        this.ModuleThrusterBase1.addBox(30F, -28F, -5F, 3, 6, 10);
        this.ModuleThrusterBase1.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterBase1.setTextureSize(512, 512);
        this.ModuleThrusterBase1.mirror = true;
        this.setRotation(this.ModuleThrusterBase1, 0F, 0F, 0F);
        this.ModuleThrusterBase2 = new GCCoreModelRenderer(this, 50, 0);
        this.ModuleThrusterBase2.addBox(5F, -39F, -5F, 3, 5, 10);
        this.ModuleThrusterBase2.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterBase2.setTextureSize(512, 512);
        this.ModuleThrusterBase2.mirror = true;
        this.setRotation(this.ModuleThrusterBase2, 0F, 0F, 0.7853982F);
        this.ModuleThrusterBase3 = new GCCoreModelRenderer(this, 50, 0);
        this.ModuleThrusterBase3.addBox(-43F, -4F, -5F, 3, 6, 10);
        this.ModuleThrusterBase3.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterBase3.setTextureSize(512, 512);
        this.ModuleThrusterBase3.mirror = true;
        this.setRotation(this.ModuleThrusterBase3, 0F, 0F, 2.356194F);
        this.ModuleThrusterBase4 = new GCCoreModelRenderer(this, 0, 23);
        this.ModuleThrusterBase4.addBox(24F, -28F, 13.7F, 3, 6, 6);
        this.ModuleThrusterBase4.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterBase4.setTextureSize(512, 512);
        this.ModuleThrusterBase4.mirror = true;
        this.setRotation(this.ModuleThrusterBase4, 0F, 0.7853982F, 0F);
        this.ModuleThrusterBase5 = new GCCoreModelRenderer(this, 0, 23);
        this.ModuleThrusterBase5.mirror = true;
        this.ModuleThrusterBase5.addBox(24F, -28F, -19.5F, 3, 6, 6);
        this.ModuleThrusterBase5.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterBase5.setTextureSize(512, 512);
        this.ModuleThrusterBase5.mirror = true;
        this.setRotation(this.ModuleThrusterBase5, 0F, -0.7853982F, 0F);
        this.ModuleThrusterBase5.mirror = false;
        this.ModuleThrusterConeTop1 = new GCCoreModelRenderer(this, 40, 9);
        this.ModuleThrusterConeTop1.addBox(-44F, -3F, -1F, 1, 2, 2);
        this.ModuleThrusterConeTop1.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeTop1.setTextureSize(512, 512);
        this.ModuleThrusterConeTop1.mirror = true;
        this.setRotation(this.ModuleThrusterConeTop1, 0F, 0F, 2.356194F);
        this.ModuleThrusterConeTop2 = new GCCoreModelRenderer(this, 30, 9);
        this.ModuleThrusterConeTop2.addBox(-45F, -3.5F, -1.5F, 1, 3, 3);
        this.ModuleThrusterConeTop2.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeTop2.setTextureSize(512, 512);
        this.ModuleThrusterConeTop2.mirror = true;
        this.setRotation(this.ModuleThrusterConeTop2, 0F, 0F, 2.356194F);
        this.ModuleThrusterConeTop3 = new GCCoreModelRenderer(this, 29, 0);
        this.ModuleThrusterConeTop3.addBox(-46F, -4F, -2F, 1, 4, 4);
        this.ModuleThrusterConeTop3.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeTop3.setTextureSize(512, 512);
        this.ModuleThrusterConeTop3.mirror = true;
        this.setRotation(this.ModuleThrusterConeTop3, 0F, 0F, 2.356194F);
        this.ModuleThrusterConeBack1 = new GCCoreModelRenderer(this, 40, 9);
        this.ModuleThrusterConeBack1.addBox(27F, -26F, -18.5F, 1, 2, 2);
        this.ModuleThrusterConeBack1.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBack1.setTextureSize(512, 512);
        this.ModuleThrusterConeBack1.mirror = true;
        this.setRotation(this.ModuleThrusterConeBack1, 0F, -0.7853982F, 0F);
        this.ModuleThrusterConeBack2 = new GCCoreModelRenderer(this, 30, 9);
        this.ModuleThrusterConeBack2.addBox(28F, -26.5F, -19F, 1, 3, 3);
        this.ModuleThrusterConeBack2.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBack2.setTextureSize(512, 512);
        this.ModuleThrusterConeBack2.mirror = true;
        this.setRotation(this.ModuleThrusterConeBack2, 0F, -0.7853982F, 0F);
        this.ModuleThrusterConeBack3 = new GCCoreModelRenderer(this, 29, 0);
        this.ModuleThrusterConeBack3.addBox(29F, -27F, -19.5F, 1, 4, 4);
        this.ModuleThrusterConeBack3.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBack3.setTextureSize(512, 512);
        this.ModuleThrusterConeBack3.mirror = true;
        this.setRotation(this.ModuleThrusterConeBack3, 0F, -0.7853982F, 0F);
        this.ModuleThrusterConeBot1 = new GCCoreModelRenderer(this, 40, 9);
        this.ModuleThrusterConeBot1.addBox(8F, -38F, -1F, 1, 2, 2);
        this.ModuleThrusterConeBot1.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBot1.setTextureSize(512, 512);
        this.ModuleThrusterConeBot1.mirror = true;
        this.setRotation(this.ModuleThrusterConeBot1, 0F, 0F, 0.7853982F);
        this.ModuleThrusterConeBot2 = new GCCoreModelRenderer(this, 30, 9);
        this.ModuleThrusterConeBot2.addBox(9F, -38.5F, -1.5F, 1, 3, 3);
        this.ModuleThrusterConeBot2.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBot2.setTextureSize(512, 512);
        this.ModuleThrusterConeBot2.mirror = true;
        this.setRotation(this.ModuleThrusterConeBot2, 0F, 0F, 0.7853982F);
        this.ModuleThrusterConeBot3 = new GCCoreModelRenderer(this, 29, 0);
        this.ModuleThrusterConeBot3.addBox(10F, -39F, -2F, 1, 4, 4);
        this.ModuleThrusterConeBot3.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeBot3.setTextureSize(512, 512);
        this.ModuleThrusterConeBot3.mirror = true;
        this.setRotation(this.ModuleThrusterConeBot3, 0F, 0F, 0.7853982F);
        this.ModuleThrusterConeFront1 = new GCCoreModelRenderer(this, 40, 9);
        this.ModuleThrusterConeFront1.addBox(27F, -26F, 16.5F, 1, 2, 2);
        this.ModuleThrusterConeFront1.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeFront1.setTextureSize(512, 512);
        this.ModuleThrusterConeFront1.mirror = true;
        this.setRotation(this.ModuleThrusterConeFront1, 0F, 0.7853982F, 0F);
        this.ModuleThrusterConeFront2 = new GCCoreModelRenderer(this, 30, 9);
        this.ModuleThrusterConeFront2.addBox(28F, -26.5F, 16F, 1, 3, 3);
        this.ModuleThrusterConeFront2.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeFront2.setTextureSize(512, 512);
        this.ModuleThrusterConeFront2.mirror = true;
        this.setRotation(this.ModuleThrusterConeFront2, 0F, 0.7853982F, 0F);
        this.ModuleThrusterConeFront3 = new GCCoreModelRenderer(this, 29, 0);
        this.ModuleThrusterConeFront3.addBox(29F, -27F, 15.5F, 1, 4, 4);
        this.ModuleThrusterConeFront3.setRotationPoint(0F, 0F, 0F);
        this.ModuleThrusterConeFront3.setTextureSize(512, 512);
        this.ModuleThrusterConeFront3.mirror = true;
        this.setRotation(this.ModuleThrusterConeFront3, 0F, 0.7853982F, 0F);
    }

    @Override
    public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        super.render(entity, par2, par3, par4, par5, par6, par7);
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, entity);
        this.BodyMain1.render(par7);
        this.BodyMain2.render(par7);
        this.BodyAux1.render(par7);
        this.BodyAux2.render(par7);
        this.BodyAux3.render(par7);
        this.BodyAux4.render(par7);
        this.BodySupportMain1.render(par7);
        this.BodySupportMain2.render(par7);
        this.LegStructureAux1e.render(par7);
        this.FootBaseg.render(par7);
        this.LegStructure1i.render(par7);
        this.LegBase1j.render(par7);
        this.FootJointk.render(par7);
        this.FootBasel.render(par7);
        this.LegBase1n.render(par7);
        this.LegStructureAux1s.render(par7);
        this.LegStructure1u.render(par7);
        this.FootJointv.render(par7);
        this.FootBasew.render(par7);
        this.FootBasex.render(par7);
        this.LegBase1z.render(par7);
        this.LegStructureAux1f.render(par7);
        this.LegStructure1g.render(par7);
        this.FootJointh.render(par7);
        this.FootBasei.render(par7);
        this.FootBasej.render(par7);
        this.LegBase1l.render(par7);
        this.LegStructureAux1q.render(par7);
        this.LegStructure1s.render(par7);
        this.FootJointt.render(par7);
        this.FootBaseu.render(par7);
        this.FootBasev.render(par7);
        this.ModuleMain1.render(par7);
        this.ModuleMain2.render(par7);
        this.ModuleMainDeco.render(par7);
        this.ModuleCore1.render(par7);
        this.ModuleCore2.render(par7);
        this.ModuleCore3.render(par7);
        this.ModuleAux1.render(par7);
        this.ModuleAux2.render(par7);
        this.ModuleAux3.render(par7);
        this.ModuleAux4.render(par7);
        this.ModuleAux5.render(par7);
        this.ModuleAux6.render(par7);
        this.ModuleAux7.render(par7);
        this.ModuleAux8.render(par7);
        this.ModuleThrusterBase1.render(par7);
        this.ModuleThrusterBase2.render(par7);
        this.ModuleThrusterBase3.render(par7);
        this.ModuleThrusterBase4.render(par7);
        this.ModuleThrusterBase5.render(par7);
        this.ModuleThrusterConeTop1.render(par7);
        this.ModuleThrusterConeTop2.render(par7);
        this.ModuleThrusterConeTop3.render(par7);
        this.ModuleThrusterConeBack1.render(par7);
        this.ModuleThrusterConeBack2.render(par7);
        this.ModuleThrusterConeBack3.render(par7);
        this.ModuleThrusterConeBot1.render(par7);
        this.ModuleThrusterConeBot2.render(par7);
        this.ModuleThrusterConeBot3.render(par7);
        this.ModuleThrusterConeFront1.render(par7);
        this.ModuleThrusterConeFront2.render(par7);
        this.ModuleThrusterConeFront3.render(par7);
    }

    private void setRotation(GCCoreModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
