package defpackage;

import io.sentry.protocol.r;
import io.sentry.util.j;
import io.sentry.util.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3121cH1 extends Y0 {

    @NotNull
    public static final List<String> t = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;

    @Nullable
    public Double d;

    @Nullable
    public Double e;
    public a f;
    public int g;
    public long h;
    public long i;
    public long j;
    public boolean k;

    @Nullable
    public r l;
    public boolean m;

    @NotNull
    public EnumC4161hE1 n;

    @NotNull
    public List<String> o;

    @NotNull
    public List<String> p;
    public boolean q;

    @NotNull
    public List<String> r;

    @NotNull
    public List<String> s;

    /* JADX INFO: renamed from: cH1$a */
    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f, int i, int i2) {
            this.sizeScale = f;
            this.bitRate = i;
            this.screenshotQuality = i2;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    @Override // defpackage.Y0
    public final void e(boolean z) {
        if (!z) {
            g();
        }
        super.e(z);
    }

    @Override // defpackage.Y0
    public final void f(boolean z) {
        if (!z) {
            g();
        }
        super.f(z);
    }

    @Override // defpackage.Y0
    public final void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        j.a("ReplayCustomMasking");
    }

    @NotNull
    public final List<String> h() {
        return this.o;
    }

    @NotNull
    public final List<String> i() {
        return this.p;
    }

    @NotNull
    public final List<String> j() {
        return this.r;
    }

    @NotNull
    public final List<String> k() {
        return this.s;
    }

    @Nullable
    public final Double l() {
        return this.e;
    }

    @Nullable
    public final Double m() {
        return this.d;
    }

    public final boolean n() {
        return this.q;
    }

    public final void o(boolean z) {
        this.m = z;
    }

    public final void p(boolean z) {
        this.q = z;
    }

    public final void q(@NotNull ArrayList arrayList) {
        this.o = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void r(@NotNull ArrayList arrayList) {
        this.p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void s(@NotNull ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(t);
        linkedHashSet.addAll(arrayList);
        this.r = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void t(@NotNull ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(t);
        linkedHashSet.addAll(arrayList);
        this.s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void u(@Nullable Double d) {
        if (u.c(d, true)) {
            this.e = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void v(@Nullable Double d) {
        if (u.c(d, true)) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
