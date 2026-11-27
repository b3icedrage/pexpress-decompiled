package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ot1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5818ot1<T> {

    @Nullable
    public final C3457dt1<T> a;

    @Nullable
    public ML0 b;

    @Nullable
    public C4906ka2 c;

    @Nullable
    public ML0 d;

    @Nullable
    public ML0 e;

    public C5818ot1() {
        throw null;
    }

    public C5818ot1(C3457dt1 c3457dt1) {
        this.a = c3457dt1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ML0, kotlin.jvm.functions.Function1] */
    public final void a() {
        ?? r1;
        ?? r2;
        C3457dt1<T> c3457dt1 = this.a;
        Integer numValueOf = c3457dt1 != null ? Integer.valueOf(c3457dt1.a) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ?? r0 = this.b;
            if (r0 != 0) {
                r0.invoke(Boolean.TRUE);
            }
            C4906ka2 c4906ka2 = this.c;
            if (c4906ka2 != null) {
                Long l = c3457dt1.b;
                c4906ka2.invoke(Long.valueOf(l != null ? l.longValue() : 0L));
            }
            T t = c3457dt1.c;
            if (t == null || (r2 = this.e) == 0) {
                return;
            }
            r2.invoke(t);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                ?? r3 = this.b;
                if (r3 != 0) {
                    r3.invoke(Boolean.FALSE);
                }
                C4906ka2 c4906ka3 = this.c;
                if (c4906ka3 != null) {
                    c4906ka3.invoke(null);
                }
                T t2 = c3457dt1.c;
                if (t2 == null || (r1 = this.e) == 0) {
                    return;
                }
                r1.invoke(t2);
                return;
            }
            return;
        }
        ?? r4 = this.b;
        if (r4 != 0) {
            r4.invoke(Boolean.FALSE);
        }
        C4906ka2 c4906ka4 = this.c;
        if (c4906ka4 != null) {
            c4906ka4.invoke(null);
        }
        Throwable th = c3457dt1.d;
        if (th != null) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                Intrinsics.checkNotNullExpressionValue(localizedMessage, "localizedMessage");
                ?? r5 = this.d;
                if (r5 != 0) {
                    r5.invoke(localizedMessage);
                }
            }
            boolean z = th instanceof C6313rF0;
        }
    }
}
