package defpackage;

import androidx.fragment.app.Fragment;
import io.sentry.android.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8100zl implements MD1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C8100zl(b bVar, Fragment fragment) {
        this.d = 3;
        this.e = fragment;
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                if (Intrinsics.a(scope.getTags().get("auth.attempt_id"), ((C0831Dl.a) this.e).b)) {
                    scope.removeTag("auth.attempt_id");
                    scope.removeTag("auth.flow");
                }
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(scope, "it");
                scope.z(b.b((Fragment) this.e));
                break;
            case 2:
                scope.z((String) this.e);
                break;
        }
    }

    public /* synthetic */ C8100zl(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
