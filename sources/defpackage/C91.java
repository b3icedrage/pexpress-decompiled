package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"LC91;", "", "<init>", "()V", "", "hasChromeTabLibrary", "()Z", "", ImagesContract.URL, "openActivity", "Landroid/content/Context;", "context", "open$com_onesignal_inAppMessages", "(Ljava/lang/String;ZLandroid/content/Context;)Z", "open", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C91 {

    @NotNull
    public static final C91 INSTANCE = new C91();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"LC91$a;", "LCR;", "", ImagesContract.URL, "", "openActivity", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;)V", "Landroid/content/ComponentName;", "componentName", "LzR;", "customTabsClient", "", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;LzR;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Ljava/lang/String;", "Z", "Landroid/content/Context;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a extends CR {

        @NotNull
        private final Context context;
        private final boolean openActivity;

        @NotNull
        private final String url;

        public a(@NotNull String url, boolean z, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            this.url = url;
            this.openActivity = z;
            this.context = context;
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
        @Override // defpackage.CR
        public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull C8029zR customTabsClient) {
            DR dr;
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(customTabsClient, "customTabsClient");
            customTabsClient.getClass();
            InterfaceC6234qs0 interfaceC6234qs0 = customTabsClient.a;
            try {
                interfaceC6234qs0.k();
            } catch (RemoteException unused) {
            }
            BinderC7819yR binderC7819yR = new BinderC7819yR();
            binderC7819yR.attachInterface(binderC7819yR, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                dr = !interfaceC6234qs0.b(binderC7819yR) ? null : new DR(interfaceC6234qs0, binderC7819yR, customTabsClient.b);
            } catch (RemoteException unused2) {
            }
            if (dr == null) {
                return;
            }
            Uri uri = Uri.parse(this.url);
            try {
                dr.a.f(dr.b, uri, new Bundle());
            } catch (RemoteException unused3) {
            }
            if (this.openActivity) {
                AR arA = new AR.b(dr).a();
                Intrinsics.checkNotNullExpressionValue(arA, "mBuilder.build()");
                Intent intent = arA.a;
                intent.setData(uri);
                intent.addFlags(268435456);
                this.context.startActivity(intent, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    private C91() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(@NotNull String url, boolean openActivity, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(url, openActivity, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
