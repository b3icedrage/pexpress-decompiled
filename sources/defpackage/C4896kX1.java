package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4896kX1 extends ML0 implements Function0<Object> {
    public final /* synthetic */ AbstractC5106lX1<Object> d;
    public final /* synthetic */ RJ0 e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4896kX1(AbstractC5106lX1 abstractC5106lX1, RJ0 rj0, Object obj) {
        super(0);
        this.d = abstractC5106lX1;
        this.e = rj0;
        this.g = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        RJ0 deserializer = this.e;
        boolean zC = deserializer.c().c();
        AbstractC5106lX1<Object> abstractC5106lX1 = this.d;
        if (!zC && !abstractC5106lX1.w()) {
            return null;
        }
        abstractC5106lX1.getClass();
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return abstractC5106lX1.d(deserializer);
    }
}
