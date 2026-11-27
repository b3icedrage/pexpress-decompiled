package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0609Ap implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C0609Ap(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) ((C6) this.b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new Sa2(context);
            case 1:
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.b).get();
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                return new C6999uY(showAlertDialogUseCase);
            case 2:
                return new C6725tC1((Set) ((C4176hJ1) this.b).get());
            default:
                J92 unsupportedRepository = (J92) this.b.get();
                Intrinsics.checkNotNullParameter(unsupportedRepository, "unsupportedRepository");
                return new C0802Db0(unsupportedRepository);
        }
    }

    public /* synthetic */ C0609Ap(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }
}
