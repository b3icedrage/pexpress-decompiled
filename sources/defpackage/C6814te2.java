package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: te2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6814te2 {

    @Nullable
    public final View a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @NotNull
    public final String f;

    @Nullable
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: te2$a */
    public static final class a {
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("Clickable", 0);
            d = aVar;
            e = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public C6814te2(@Nullable View view, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String source, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.a = view;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = source;
        this.g = str5;
        new WeakReference(view);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6814te2)) {
            return false;
        }
        C6814te2 c6814te2 = (C6814te2) obj;
        return Intrinsics.a(this.a, c6814te2.a) && Intrinsics.a(this.b, c6814te2.b) && Intrinsics.a(this.c, c6814te2.c) && Intrinsics.a(this.d, c6814te2.d) && Intrinsics.a(this.e, c6814te2.e) && this.f.equals(c6814te2.f) && Intrinsics.a(this.g, c6814te2.g);
    }

    public final int hashCode() {
        View view = this.a;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iB = C1039Gc0.b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        return iB + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTarget(_view=");
        sb.append(this.a);
        sb.append(", className=");
        sb.append(this.b);
        sb.append(", resourceName=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", hierarchy=");
        return C1039Gc0.e(sb, this.g, ')');
    }
}
