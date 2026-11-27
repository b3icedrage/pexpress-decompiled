package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5162lm0 implements InterfaceC3129cK0 {
    public final C6340rO0 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public C5162lm0(URL url) {
        C6340rO0 c6340rO0 = InterfaceC3232co0.a;
        UE.e(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        UE.e(c6340rO0, "Argument must not be null");
        this.b = c6340rO0;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC3129cK0.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        UE.e(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    UE.e(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5162lm0)) {
            return false;
        }
        C5162lm0 c5162lm0 = (C5162lm0) obj;
        return c().equals(c5162lm0.c()) && this.b.equals(c5162lm0.b);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public C5162lm0(String str) {
        C6340rO0 c6340rO0 = InterfaceC3232co0.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            UE.e(c6340rO0, "Argument must not be null");
            this.b = c6340rO0;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
