package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JT1 {
    public final int a;
    public final int b;

    public JT1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JT1)) {
            return false;
        }
        JT1 jt1 = (JT1) obj;
        return this.a == jt1.a && this.b == jt1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.try_again_get_info_text) + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StubResultsData(image=");
        sb.append(this.a);
        sb.append(", title=");
        return SK.b(sb, this.b, ", subtitle=2131952650)");
    }
}
