package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6161qY0 extends ML0 implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6161qY0(C6370rY0 c6370rY0, String str) {
        super(1);
        this.g = c6370rY0;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C4220hY0 it = (C4220hY0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z = it.c;
                String str = this.e;
                C6370rY0 c6370rY0 = (C6370rY0) this.g;
                if (z) {
                    c6370rY0.c.b(str, AbstractC4688jY0.b.a);
                } else {
                    c6370rY0.c.b(str, new AbstractC4688jY0.e(it));
                }
                break;
            default:
                OP1.a updateStateInRepositoryThread = (OP1.a) obj;
                Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
                C5951pY0 call = new C5951pY0(this.e, (String) this.g);
                updateStateInRepositoryThread.getClass();
                Intrinsics.checkNotNullParameter(call, "call");
                updateStateInRepositoryThread.c = call;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6161qY0(String str, String str2) {
        super(1);
        this.e = str;
        this.g = str2;
    }
}
