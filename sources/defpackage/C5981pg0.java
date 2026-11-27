package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import kotlin.Unit;

/* JADX INFO: renamed from: pg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5981pg0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C5981pg0(InterfaceC6396rf0 interfaceC6396rf0, Object obj, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
        this.g = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [AW1, Ij0] */
    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objA = C4372iF.a(jm, interfaceC6606sf0, new C5771og0(null, (AW1) this.g), C7240vg0.d, (InterfaceC6396rf0[]) this.e);
                return objA == MN.d ? objA : Unit.a;
            case 1:
                Object objC = ((InterfaceC6396rf0) this.e).c(new C8142zy0(interfaceC6606sf0, (AbstractC0637Ay0) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            default:
                Object objC2 = ((C1912Rg1) this.e).c(new H52(interfaceC6606sf0, (TutorialPageFragmentBase) this.g), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5981pg0(InterfaceC6396rf0[] interfaceC6396rf0Arr, InterfaceC1216Ij0 interfaceC1216Ij0) {
        this.d = 0;
        this.e = interfaceC6396rf0Arr;
        this.g = (AW1) interfaceC1216Ij0;
    }
}
