package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ljm1;", "", "<init>", "()V", "d", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractC4743jm1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final S0 e;

    /* JADX INFO: renamed from: jm1$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractC4743jm1 implements Serializable {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // defpackage.AbstractC4743jm1
        public final int a(int i) {
            return AbstractC4743jm1.e.a(i);
        }

        @Override // defpackage.AbstractC4743jm1
        public final boolean b() {
            return AbstractC4743jm1.e.b();
        }
    }

    static {
        C0812De1.a.getClass();
        Integer num = DD0.a.b;
        e = (num == null || num.intValue() >= 34) ? new C1906Re1() : new C0880Eb0();
    }

    public abstract int a(int i);

    public boolean b() {
        return a(1) != 0;
    }
}
