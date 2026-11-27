package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: iw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4553iw0 {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final HashMap c;

    public C4553iw0(Drawable.Callback callback, String str, HashMap map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str.concat("/");
        }
        this.c = map;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }
}
