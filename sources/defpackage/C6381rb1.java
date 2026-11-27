package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import kotlin.time.b;
import kotlin.time.c;
import kotlin.time.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6381rb1 {
    public static final long m;

    @NotNull
    public final EM a;

    @NotNull
    public final String b;
    public final long c;

    @NotNull
    public final f d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C1699On1 f;
    public int g;

    @NotNull
    public Set<? extends a> h;
    public boolean i;
    public long j;

    @Nullable
    public C2936bP1 k;

    @Nullable
    public TimeMark l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: rb1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;
        public static final /* synthetic */ C4814k70 j;

        static {
            a aVar = new a("SCRIPT_APPLIED", 0);
            d = aVar;
            a aVar2 = new a("DOCUMENT_READY", 1);
            e = aVar2;
            a aVar3 = new a("CRYPTO_HIDDEN", 2);
            g = aVar3;
            a aVar4 = new a("DEPOSIT_INSERTED", 3);
            h = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            i = aVarArr;
            j = C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    static {
        b.a aVar = b.e;
        m = c.g(10, R40.SECONDS);
    }

    public C6381rb1(EM scope, String name) {
        f.a timeSource = f.a.a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.a = scope;
        this.b = name;
        long j = m;
        this.c = j;
        this.d = timeSource;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.e = gp1I;
        this.f = C4466ii.f(gp1I);
        this.h = C6702t60.d;
        this.j = j;
    }

    public final void a(@NotNull a condition, int i) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (i == this.g && this.h.contains(condition)) {
            this.h = C5907pJ1.c(this.h, condition);
            c();
        }
    }

    public final void c() {
        C2936bP1 c2936bP1;
        Boolean boolValueOf = Boolean.valueOf(!this.h.isEmpty());
        GP1 gp1 = this.e;
        gp1.getClass();
        gp1.m(null, boolValueOf);
        boolean z = this.i && !this.h.isEmpty();
        if (z && ((c2936bP1 = this.k) == null || !c2936bP1.g())) {
            int i = this.g;
            this.l = this.d.a();
            this.k = C5189lv.k(this.a, null, new C6591sb1(this, i, null), 3);
        } else {
            if (z) {
                return;
            }
            TimeMark timeMark = this.l;
            if (timeMark != null) {
                this.j = b.p(this.j, b.t(timeMark.b()));
            }
            this.l = null;
            C2936bP1 c2936bP2 = this.k;
            if (c2936bP2 != null) {
                c2936bP2.l(null);
            }
            this.k = null;
        }
    }
}
