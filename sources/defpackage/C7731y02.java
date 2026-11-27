package defpackage;

import com.google.android.gms.common.internal.Objects;
import io.sentry.android.core.b0;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: y02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7731y02 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public C7731y02(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            b0.e("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(C1039Gc0.d("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = C2629a1.b(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7731y02)) {
            return false;
        }
        C7731y02 c7731y02 = (C7731y02) obj;
        return this.a.equals(c7731y02.a) && this.b.equals(c7731y02.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }
}
