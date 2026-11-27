package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4948kl0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final Object c;

    public /* synthetic */ C4948kl0(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.c = obj;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4738jl0((InterfaceC1131Hh) ((C2147Uh) this.c).get(), (C4923kf) this.b.get());
            case 1:
                Context context = (Context) this.b.get();
                ((BV0) this.c).getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                C0957Fb.i(packageManager);
                return packageManager;
            case 2:
                return new C2951bU1((Context) ((C6) this.c).get(), (InterfaceC1446Li) this.b.get());
            default:
                C4923kf appData = (C4923kf) this.b.get();
                O3 accountModeSelectionUseCase = (O3) ((InterfaceC1531Mk1) this.c).get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
                return new Y22(appData, accountModeSelectionUseCase);
        }
    }

    public C4948kl0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 3;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }
}
