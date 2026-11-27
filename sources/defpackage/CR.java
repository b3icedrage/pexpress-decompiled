package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class CR implements ServiceConnection {
    private Context mApplicationContext;

    public class a extends C8029zR {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull C8029zR c8029zR);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        InterfaceC6234qs0 interfaceC6234qs0;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = InterfaceC6234qs0.a.b;
        if (iBinder == null) {
            interfaceC6234qs0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6234qs0)) {
                InterfaceC6234qs0.a.C0479a c0479a = new InterfaceC6234qs0.a.C0479a();
                c0479a.b = iBinder;
                interfaceC6234qs0 = c0479a;
            } else {
                interfaceC6234qs0 = (InterfaceC6234qs0) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new a(interfaceC6234qs0, componentName));
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
