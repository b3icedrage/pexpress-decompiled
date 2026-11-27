package defpackage;

import com.google.android.gms.common.api.Api;
import defpackage.AbstractC3691f1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3272d1<S extends AbstractC3691f1<?>> {

    @Nullable
    public S[] d;
    public int e;
    public int g;

    @Nullable
    public C7410wU1 h;

    @NotNull
    public final S g() {
        S s;
        C7410wU1 c7410wU1;
        synchronized (this) {
            try {
                S[] sArr = this.d;
                if (sArr == null) {
                    sArr = (S[]) k();
                    this.d = sArr;
                } else if (this.e >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.d = (S[]) ((AbstractC3691f1[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC3691f1[]) objArrCopyOf);
                }
                int i = this.g;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) j();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.g = i;
                this.e++;
                c7410wU1 = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7410wU1 != null) {
            c7410wU1.z(1);
        }
        return s;
    }

    @NotNull
    public final C7410wU1 i() {
        C7410wU1 c7410wU1;
        synchronized (this) {
            c7410wU1 = this.h;
            if (c7410wU1 == null) {
                int i = this.e;
                c7410wU1 = new C7410wU1(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, EnumC1796Pu.e);
                c7410wU1.h(Integer.valueOf(i));
                this.h = c7410wU1;
            }
        }
        return c7410wU1;
    }

    @NotNull
    public abstract S j();

    @NotNull
    public abstract AbstractC3691f1[] k();

    public final void l(@NotNull S s) {
        C7410wU1 c7410wU1;
        int i;
        JM[] jmArrB;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                c7410wU1 = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                Intrinsics.c(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                jmArrB = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (JM jm : jmArrB) {
            if (jm != null) {
                C1717Ot1.a aVar = C1717Ot1.e;
                jm.resumeWith(Unit.a);
            }
        }
        if (c7410wU1 != null) {
            c7410wU1.z(-1);
        }
    }
}
