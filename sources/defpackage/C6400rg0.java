package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import kotlin.Unit;

/* JADX INFO: renamed from: rg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6400rg0 implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C6400rg0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jj0, java.lang.Object] */
    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objA = C4372iF.a(jm, interfaceC6606sf0, new C6191qg0(null, this.g), C7240vg0.d, (InterfaceC6396rf0[]) this.e);
                return objA == MN.d ? objA : Unit.a;
            default:
                Object objC = ((C1912Rg1) this.e).c(new I52(interfaceC6606sf0, (TutorialPageFragmentBase) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
        }
    }
}
