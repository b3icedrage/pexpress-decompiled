package defpackage;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/* JADX INFO: loaded from: classes.dex */
public final class GD0 {
    public static Context a() {
        return new InitialContext();
    }

    public static String b(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Object objLookup = context.lookup(str);
            if (objLookup == null) {
                return null;
            }
            return objLookup.toString();
        } catch (NamingException unused) {
            return null;
        }
    }
}
