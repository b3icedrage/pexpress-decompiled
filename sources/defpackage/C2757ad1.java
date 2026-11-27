package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ad1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2757ad1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C2757ad1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2554Zc1((C4923kf) this.b.get(), (C6754tM0) ((InterfaceC1454Lk1) this.c).get(), (Context) ((C6) this.d).get());
            case 1:
                C4923kf appData = (C4923kf) this.b.get();
                C5176lq1 registerAndLoginParamsUseCase = (C5176lq1) this.c.get();
                AbstractC3900g02 tokenUseCase = (AbstractC3900g02) this.d.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(registerAndLoginParamsUseCase, "registerAndLoginParamsUseCase");
                Intrinsics.checkNotNullParameter(tokenUseCase, "tokenUseCase");
                return new C7566xC1(appData, registerAndLoginParamsUseCase, tokenUseCase);
            default:
                return new Hh2((Context) this.b.get(), new C2286Wa(), (InterfaceC6061q30) ((C4587j3) this.c).get(), (C2877b7) this.d.get());
        }
    }
}
