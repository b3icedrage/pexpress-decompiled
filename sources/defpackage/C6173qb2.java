package defpackage;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: qb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6173qb2 {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
