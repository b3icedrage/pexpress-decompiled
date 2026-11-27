package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4405iQ implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                FF it = (FF) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.E);
            default:
                Map.Entry it2 = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getKey() + ":" + it2.getValue();
        }
    }
}
