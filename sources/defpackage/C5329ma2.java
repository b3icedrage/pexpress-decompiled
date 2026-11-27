package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ma2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5329ma2 extends ML0 implements Function1<C5818ot1<String>, Unit> {
    public final /* synthetic */ C4228ha2 d;
    public final /* synthetic */ C1351Kc0 e;
    public final /* synthetic */ TF0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5329ma2(C4228ha2 c4228ha2, C1351Kc0 c1351Kc0, TF0 tf0) {
        super(1);
        this.d = c4228ha2;
        this.e = c1351Kc0;
        this.g = tf0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C5818ot1<String> c5818ot1) {
        C5818ot1<String> loadSilentlyResource = c5818ot1;
        Intrinsics.checkNotNullParameter(loadSilentlyResource, "$this$loadSilentlyResource");
        loadSilentlyResource.getClass();
        C4561iz consumer = C4561iz.h;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        loadSilentlyResource.b = consumer;
        C1351Kc0 c1351Kc0 = this.e;
        C4228ha2 c4228ha2 = this.d;
        C4906ka2 consumer2 = new C4906ka2(c4228ha2, c1351Kc0);
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        loadSilentlyResource.c = consumer2;
        C4536iq0 consumer3 = new C4536iq0(this.g, 1);
        Intrinsics.checkNotNullParameter(consumer3, "consumer");
        loadSilentlyResource.e = consumer3;
        C5116la2 consumer4 = new C5116la2(c4228ha2, c1351Kc0);
        Intrinsics.checkNotNullParameter(consumer4, "consumer");
        loadSilentlyResource.d = consumer4;
        return Unit.a;
    }
}
