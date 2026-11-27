package defpackage;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D8 implements InterfaceC1608Nj0, C6973uP0.a, MD1 {
    public final /* synthetic */ int d;

    public /* synthetic */ D8(int i) {
        this.d = i;
    }

    @Override // defpackage.C6973uP0.a
    public String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 0:
                return ((L8) obj).d();
            case 1:
                AbstractC7844yZ0 abstractC7844yZ0 = (AbstractC7844yZ0) obj;
                if (abstractC7844yZ0 instanceof TD) {
                    return ((TD) abstractC7844yZ0).a.d;
                }
                if (abstractC7844yZ0 instanceof LF1) {
                    return ((LF1) abstractC7844yZ0).a.d;
                }
                throw new IllegalArgumentException("There is unhandled type of client text message");
            default:
                SF0.a aVar = (SF0.a) obj;
                return Boolean.valueOf((aVar == null || aVar.a || !aVar.b || aVar.c) ? false : true);
        }
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.C();
    }
}
