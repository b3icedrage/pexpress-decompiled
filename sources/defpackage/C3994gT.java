package defpackage;

/* JADX INFO: renamed from: gT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3994gT {
    public static final C6342rP b = new C6342rP();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final EK e = new EK(2);
    public final C3036bs1 a;

    public C3994gT(C3036bs1 c3036bs1) {
        this.a = c3036bs1;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
