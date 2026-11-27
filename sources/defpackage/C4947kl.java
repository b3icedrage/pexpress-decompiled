package defpackage;

import com.appsflyer.internal.AFa1mSDK;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4947kl implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C4947kl(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C0857Dt1 it = (C0857Dt1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.n;
            default:
                return AFa1mSDK.AFLogger(obj);
        }
    }
}
