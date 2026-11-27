package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2232Vj0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C2232Vj0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (List) this.e;
            default:
                return new MJ0.a((MJ0) this.e);
        }
    }
}
