package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1533Ml0 {
    public ByteBuffer b;
    public C1456Ll0 c;
    public final byte[] a = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    @NonNull
    public final C1456Ll0 b() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            C1456Ll0 c1456Ll0 = this.c;
            c1456Ll0.h = (iC & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            c1456Ll0.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            C1456Ll0 c1456Ll1 = this.c;
            c();
            c1456Ll1.getClass();
            if (this.c.h && !a()) {
                C1456Ll0 c1456Ll2 = this.c;
                c1456Ll2.a = e(c1456Ll2.i);
                C1456Ll0 c1456Ll3 = this.c;
                c1456Ll3.k = c1456Ll3.a[c1456Ll3.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new C1222Il0();
                        c();
                        int iC4 = c();
                        C1222Il0 c1222Il0 = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        c1222Il0.g = i2;
                        if (i2 == 0) {
                            c1222Il0.g = 1;
                        }
                        c1222Il0.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C1222Il0 c1222Il1 = this.c.d;
                        c1222Il1.i = s * 10;
                        c1222Il1.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    C1456Ll0 c1456Ll4 = this.c;
                    if (c1456Ll4.d == null) {
                        c1456Ll4.d = new C1222Il0();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    C1222Il0 c1222Il2 = this.c.d;
                    c1222Il2.e = (iC5 & 64) != 0;
                    if (z2) {
                        c1222Il2.k = e(iPow);
                    } else {
                        c1222Il2.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        C1456Ll0 c1456Ll5 = this.c;
                        c1456Ll5.c++;
                        c1456Ll5.e.add(c1456Ll5.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            C1456Ll0 c1456Ll6 = this.c;
            if (c1456Ll6.c < 0) {
                c1456Ll6.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
