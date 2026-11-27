package defpackage;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS0;", "Ljm1;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class S0 extends AbstractC4743jm1 {
    @Override // defpackage.AbstractC4743jm1
    public final int a(int i) {
        return ((-i) >> 31) & (c().nextInt() >>> (32 - i));
    }

    @Override // defpackage.AbstractC4743jm1
    public final boolean b() {
        return c().nextBoolean();
    }

    @NotNull
    public abstract Random c();
}
