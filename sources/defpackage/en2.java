package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class en2 {
    public final fn2 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();
    public dn2 e = null;

    public en2(fn2 fn2Var, IntentFilter intentFilter, Context context) {
        this.a = fn2Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        dn2 dn2Var;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            dn2 dn2Var2 = new dn2(this);
            this.e = dn2Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(dn2Var2, intentFilter, 2);
            } else {
                context.registerReceiver(dn2Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (dn2Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(dn2Var);
        this.e = null;
    }
}
