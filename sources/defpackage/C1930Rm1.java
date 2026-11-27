package defpackage;

/* JADX INFO: renamed from: Rm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1930Rm1 implements AZ0 {
    public final GZ0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C1930Rm1(GZ0 gz0, String str, Object[] objArr) {
        char cCharAt;
        this.a = gz0;
        this.b = str;
        this.c = objArr;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // defpackage.AZ0
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.AZ0
    public final GZ0 b() {
        return this.a;
    }

    @Override // defpackage.AZ0
    public final EnumC7468wk1 c() {
        return (this.d & 1) == 1 ? EnumC7468wk1.d : EnumC7468wk1.e;
    }
}
