package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3872fs {
    public static final String b;
    public static final String c;
    public static final C3872fs d;
    public static final C3872fs e;
    public final boolean a;

    /* JADX INFO: renamed from: fs$a */
    public static class a {
        public static final byte[] e = new byte[1792];
        public final CharSequence a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public a(CharSequence charSequence) {
            this.a = charSequence;
            this.b = charSequence.length();
        }

        public final byte a() {
            int i = this.c - 1;
            CharSequence charSequence = this.a;
            char cCharAt = charSequence.charAt(i);
            this.d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.c);
                this.c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.c--;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }
    }

    static {
        WX1.c cVar = WX1.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new C3872fs(false);
        e = new C3872fs(true);
    }

    public C3872fs(boolean z) {
        WX1.c cVar = WX1.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.c;
            if (i4 < aVar.b && i == 0) {
                CharSequence charSequence2 = aVar.a;
                char cCharAt = charSequence2.charAt(i4);
                aVar.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.c);
                    aVar.c = Character.charCount(iCodePointAt) + aVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.c++;
                    char c2 = aVar.d;
                    directionality = c2 < 1792 ? a.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (aVar.c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.c = aVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (aVar.c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        WX1.c cVar = WX1.c;
        if (charSequence == null) {
            return null;
        }
        boolean zB = cVar.b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zB2 = (zB ? WX1.b : WX1.a).b(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zB2 || a(charSequence) == 1)) {
            str = (!z || (zB2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zB != z) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? WX1.b : WX1.a).b(charSequence.length(), charSequence);
        if (!z && (zB3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zB3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
