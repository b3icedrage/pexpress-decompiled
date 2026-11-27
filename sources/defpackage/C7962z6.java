package defpackage;

import com.base.feature.activation.screens.step_description.ActivationStepDescriptionFragment;

/* JADX INFO: renamed from: z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7962z6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C7962z6(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ActivationStepDescriptionFragment((Sd2) ((OW) this.b).get());
            case 1:
                return new C1374Kk((M8) this.b.get());
            default:
                return new C6229qq1((VK1) ((XK1) this.b).get());
        }
    }
}
