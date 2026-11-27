package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2433Xo0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2433Xo0(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C5818ot1 loadSilentlyResource = (C5818ot1) obj;
                Intrinsics.checkNotNullParameter(loadSilentlyResource, "$this$loadSilentlyResource");
                H90 consumer = new H90((C2511Yo0) this.e, 1);
                loadSilentlyResource.getClass();
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                loadSilentlyResource.e = consumer;
                C2329Wo0 consumer2 = C2329Wo0.e;
                Intrinsics.checkNotNullParameter(consumer2, "consumer");
                loadSilentlyResource.d = consumer2;
                break;
            default:
                OP1.a updateStateInRepositoryThread = (OP1.a) obj;
                Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
                String str = (String) this.e;
                H90 call = new H90(str, 2);
                updateStateInRepositoryThread.getClass();
                Intrinsics.checkNotNullParameter(call, "call");
                updateStateInRepositoryThread.b = call;
                GF1 call2 = new GF1(str);
                Intrinsics.checkNotNullParameter(call2, "call");
                updateStateInRepositoryThread.c = call2;
                break;
        }
        return Unit.a;
    }
}
