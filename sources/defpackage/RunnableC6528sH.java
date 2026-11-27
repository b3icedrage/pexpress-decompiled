package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.android.ndk.c;
import io.sentry.ndk.NativeScope;
import java.util.Random;

/* JADX INFO: renamed from: sH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6528sH implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC6528sH(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7203vW.a<T> aVar;
        switch (this.d) {
            case 0:
                C4017ga1 c4017ga1 = (C4017ga1) this.e;
                InterfaceC1612Nk1<T> interfaceC1612Nk1 = (InterfaceC1612Nk1) this.g;
                if (c4017ga1.b != C4017ga1.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (c4017ga1) {
                    aVar = c4017ga1.a;
                    c4017ga1.a = null;
                    c4017ga1.b = interfaceC1612Nk1;
                    break;
                }
                aVar.d(interfaceC1612Nk1);
                return;
            case 1:
                ((ProfileInstallerInitializer) this.e).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new DF0((Context) this.g, 2), new Random().nextInt(Math.max(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 1)) + 5000);
                return;
            case 2:
                ((AFi1aSDK) this.e).AFLogger((ReferrerProp) this.g);
                return;
            default:
                ((c) this.e).b.getClass();
                NativeScope.nativeRemoveTag((String) this.g);
                return;
        }
    }
}
