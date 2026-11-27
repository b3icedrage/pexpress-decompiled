package defpackage;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2612Zw {
    public static final String c = C4994l.g("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final Set<H60> d;
    public static final C2612Zw e;

    @NonNull
    public final String a;
    public final String b;

    static {
        String strG = C4994l.g("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strG2 = C4994l.g("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new H60("proto"), new H60("json"))));
        e = new C2612Zw(strG, strG2);
    }

    public C2612Zw(@NonNull String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public static C2612Zw a(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2612Zw(str2, str3);
    }
}
