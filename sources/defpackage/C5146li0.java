package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import com.jivosite.sdk.ui.chat.JivoChatFragment;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5146li0 extends AbstractC4936ki0 implements T81.a {
    public static final SparseIntArray T;

    @NonNull
    public final LinearLayoutCompat N;

    @NonNull
    public final AppCompatTextView O;
    public final T81 P;
    public final T81 Q;
    public final T81 R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 10);
        sparseIntArray.put(R.id.banner, 11);
        sparseIntArray.put(R.id.connectionState, 12);
        sparseIntArray.put(R.id.connectionStateName, 13);
        sparseIntArray.put(R.id.connectingView, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5146li0(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 15, T);
        super(interfaceC5089lS, view, (AppCompatImageButton) objArrS[7], (AppCompatTextView) objArrS[11], (CircularProgressIndicator) objArrS[14], (TextView) objArrS[5], (CardView) objArrS[12], (TextView) objArrS[13], (ConstraintLayout) objArrS[0], (LinearLayoutCompat) objArrS[6], (TextInputEditText) objArrS[8], (RecyclerView) objArrS[3], (MaterialButton) objArrS[9], (MaterialToolbar) objArrS[2]);
        this.S = -1L;
        this.y.setTag(null);
        this.B.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArrS[1];
        this.N = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArrS[4];
        this.O = appCompatTextView;
        appCompatTextView.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        y(view);
        this.P = new T81(this, 2);
        this.Q = new T81(this, 3);
        this.R = new T81(this, 1);
        synchronized (this) {
            this.S = 512L;
        }
        v();
    }

    @Override // defpackage.AbstractC4936ki0
    public final void A(JivoChatFragment jivoChatFragment) {
        this.K = jivoChatFragment;
        synchronized (this) {
            this.S |= 128;
        }
        j(1);
        v();
    }

    @Override // defpackage.AbstractC4936ki0
    public final void B(SF0 sf0) {
        this.L = sf0;
        synchronized (this) {
            this.S |= 256;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        JivoChatFragment jivoChatFragment;
        if (i == 1) {
            SF0 sf0 = this.L;
            if (sf0 != null) {
                int i2 = JivoWebSocketService.q;
                Context appContext = sf0.p.a;
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intent intent = new Intent(appContext, (Class<?>) JivoWebSocketService.class);
                intent.setAction("com.jivosite.sdk.socket.JivoWebSocketService.ACTION_RECONNECT");
                appContext.startService(intent);
                return;
            }
            return;
        }
        if (i == 2) {
            JivoChatFragment jivoChatFragment2 = this.K;
            if (jivoChatFragment2 != null) {
                AbstractC6076q7<String> abstractC6076q7 = jivoChatFragment2.i;
                if (abstractC6076q7 != null) {
                    abstractC6076q7.a("*/*");
                    return;
                } else {
                    Intrinsics.l("contentResultCallback");
                    throw null;
                }
            }
            return;
        }
        if (i == 3 && (jivoChatFragment = this.K) != null) {
            AbstractC4936ki0 abstractC4936ki0 = jivoChatFragment.m;
            if (abstractC4936ki0 == null) {
                Intrinsics.l("binding");
                throw null;
            }
            String data = String.valueOf(abstractC4936ki0.G.getText());
            if (!StringsKt.I(data)) {
                AbstractC4936ki0 abstractC4936ki1 = jivoChatFragment.m;
                if (abstractC4936ki1 == null) {
                    Intrinsics.l("binding");
                    throw null;
                }
                Editable text = abstractC4936ki1.G.getText();
                if (text != null) {
                    text.clear();
                }
                SF0 sf0I = jivoChatFragment.i();
                Intrinsics.checkNotNullParameter(data, "text");
                Intrinsics.checkNotNullParameter("text/plain", "type");
                Intrinsics.checkNotNullParameter(data, "data");
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                sf0I.n(new ClientMessage(string, System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), "text/plain", data, TZ0.c.a));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                C4201hS c4201hS = C6104qF0.a;
                C6333rM.checkSelfPermission(jivoChatFragment.requireContext(), "android.permission.POST_NOTIFICATIONS");
                ArrayList<WeakReference<O61>> arrayList = C6104qF0.e;
                ArrayList arrayList2 = new ArrayList();
                for (WeakReference<O61> weakReference : arrayList) {
                    if (weakReference.get() != null) {
                        arrayList2.add(weakReference);
                    }
                }
                arrayList.clear();
                if (arrayList2.isEmpty()) {
                    AbstractC6076q7<String> abstractC6076q8 = jivoChatFragment.j;
                    if (abstractC6076q8 != null) {
                        abstractC6076q8.a("android.permission.POST_NOTIFICATIONS");
                        return;
                    } else {
                        Intrinsics.l("pushNotificationPermissionLauncher");
                        throw null;
                    }
                }
                arrayList.addAll(arrayList2);
                Iterator<WeakReference<O61>> it = arrayList.iterator();
                while (it.hasNext()) {
                    O61 o61 = it.next().get();
                    if (o61 != null) {
                        o61.a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[PHI: r3
      0x0091: PHI (r3v5 long) = (r3v0 long), (r3v9 long) binds: [B:29:0x0065, B:43:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [OM1, XC1, androidx.lifecycle.g] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.databinding.ViewDataBinding, ki0, li0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, androidx.appcompat.widget.Toolbar, com.google.android.material.appbar.MaterialToolbar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [EY0, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
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
    @Override // androidx.databinding.ViewDataBinding
    public final void o() throws Throwable {
        long j;
        long j2;
        Throwable th;
        long j3;
        int i;
        int i2;
        boolean zW;
        int i3;
        boolean zW2;
        boolean zW3;
        List agents;
        ?? r10;
        long j4;
        Object obj;
        long j5;
        ?? r7;
        ?? r8;
        boolean zW4;
        long j6;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        SF0 sf0 = this.L;
        if ((895 & j) != 0) {
            if ((j & 769) == 0) {
                agents = null;
            } else {
                EY0 ey0 = sf0 != null ? sf0.C : null;
                z(0, ey0);
                if (ey0 != null) {
                    agents = (List) ey0.d();
                } else {
                    agents = null;
                }
            }
            if ((j & 770) != 0) {
                EY0 ey1 = sf0 != null ? sf0.E : null;
                z(1, ey1);
                zW = ViewDataBinding.w(ey1 != null ? (Boolean) ey1.d() : null);
            } else {
                zW = false;
            }
            long j7 = j & 772;
            j3 = 800;
            if (j7 == 0) {
                i3 = 0;
            } else {
                EY0 ey2 = sf0 != null ? sf0.F : null;
                z(2, ey2);
                boolean zW5 = ViewDataBinding.w(ey2 != null ? (Boolean) ey2.d() : null);
                if (j7 != 0) {
                    j |= zW5 ? 32768L : 16384L;
                }
                if (zW5) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            if ((j & 776) != 0) {
                EY0 ey3 = sf0 != null ? sf0.H : null;
                z(3, ey3);
                zW2 = ViewDataBinding.w(ey3 != null ? (Boolean) ey3.d() : null);
            } else {
                zW2 = false;
            }
            j2 = 784;
            if ((j & 784) != 0) {
                EY0 ey4 = sf0 != null ? sf0.I : null;
                z(4, ey4);
                zW3 = ViewDataBinding.w(ey4 != null ? (Boolean) ey4.d() : null);
            } else {
                zW3 = false;
            }
            if ((j & 800) != 0) {
                EY0 ey5 = sf0 != null ? sf0.A : null;
                th = null;
                z(5, ey5);
                if (ey5 != null) {
                    obj = (List) ey5.d();
                }
                j5 = j & 832;
                if (j5 != 0) {
                    if (sf0 != null) {
                        r7 = sf0.D;
                    } else {
                        r7 = th;
                    }
                    z(6, r7);
                    if (r7 != 0) {
                        r8 = (Boolean) r7.d();
                    } else {
                        r8 = th;
                    }
                    zW4 = ViewDataBinding.w(r8);
                    if (j5 != 0) {
                        if (zW4) {
                            j6 = 10240;
                        } else {
                            j6 = 5120;
                        }
                        j |= j6;
                    }
                    if (zW4) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    if (zW4) {
                        i = 4;
                        r10 = obj;
                    } else {
                        i = 0;
                        r10 = obj;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                    r10 = obj;
                }
            } else {
                th = null;
            }
            obj = th;
            j5 = j & 832;
            if (j5 != 0) {
                if (sf0 != null) {
                    r7 = sf0.D;
                } else {
                    r7 = th;
                }
                z(6, r7);
                if (r7 != 0) {
                    r8 = (Boolean) r7.d();
                } else {
                    r8 = th;
                }
                zW4 = ViewDataBinding.w(r8);
                if (j5 != 0) {
                    if (zW4) {
                        j6 = 10240;
                    } else {
                        j6 = 5120;
                    }
                    j |= j6;
                }
                if (zW4) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                if (zW4) {
                    i = 4;
                    r10 = obj;
                } else {
                    i = 0;
                    r10 = obj;
                }
            } else {
                i = 0;
                i2 = 0;
                r10 = obj;
            }
        } else {
            j2 = 784;
            th = null;
            j3 = 800;
            i = 0;
            i2 = 0;
            zW = false;
            i3 = 0;
            zW2 = false;
            zW3 = false;
            agents = null;
            r10 = 0;
        }
        if ((j & j2) != 0) {
            this.y.setEnabled(zW3);
        }
        if ((j & 512) != 0) {
            this.y.setOnClickListener(this.P);
            this.B.setOnClickListener(this.R);
            this.I.setOnClickListener(this.Q);
        }
        if ((j & 772) != 0) {
            this.y.setVisibility(i3);
        }
        if ((j & 832) != 0) {
            this.F.setVisibility(i);
            this.N.setVisibility(i2);
            this.H.setVisibility(i);
        }
        if ((j & 776) != 0) {
            TextInputEditText view = this.G;
            Intrinsics.checkNotNullParameter(view, "view");
            view.setHint(view.getContext().getString(zW2 ? R.string.input_message_placeholder : R.string.chat_input_status_contact_info));
            view.setEnabled(zW2);
        }
        if ((j & j3) != 0) {
            AppCompatTextView view2 = this.O;
            Intrinsics.checkNotNullParameter(view2, "view");
            view2.setVisibility((r10 == 0 || r10.isEmpty()) ? 4 : 0);
            if (r10 != 0 && !r10.isEmpty()) {
                Context context = view2.getContext();
                int size = r10.size();
                view2.setText(size != 1 ? size != 2 ? context.getString(R.string.chat_system_few_agents_typing, C3686f.j(((C7129v8) r10.get(0)).c), C3686f.j(((C7129v8) r10.get(1)).c), Integer.valueOf(r10.size() - 2)) : context.getString(R.string.chat_system_two_agents_typing, C3686f.j(((C7129v8) r10.get(0)).c), C3686f.j(((C7129v8) r10.get(1)).c)) : context.getString(R.string.chat_system_one_agent_typing, ((C7129v8) r10.get(0)).c));
            }
        }
        if ((j & 770) != 0) {
            this.I.setEnabled(zW);
        }
        if ((j & 769) != 0) {
            ?? view3 = this.J;
            Intrinsics.checkNotNullParameter(view3, "view");
            Intrinsics.checkNotNullParameter(agents, "agents");
            Context context2 = view3.getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(R.style.Widget_JivoSDK_Toolbar, C2161Ul1.b);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…styleable.JivoSDKToolbar)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
            if (drawable == null) {
                drawable = C6333rM.getDrawable(context2, 2131231381);
            }
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            String string = typedArrayObtainStyledAttributes.getString(3);
            if (string == null) {
                string = context2.getString(R.string.chat_title_placeholder);
            }
            Intrinsics.checkNotNullExpressionValue(string, "typedArray.getString(R.s…g.chat_title_placeholder)");
            String string2 = typedArrayObtainStyledAttributes.getString(2);
            if (string2 == null) {
                string2 = context2.getString(R.string.chat_subtitle_placeholder);
            }
            Intrinsics.checkNotNullExpressionValue(string2, "typedArray.getString(R.s…hat_subtitle_placeholder)");
            typedArrayObtainStyledAttributes.recycle();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : agents) {
                C7129v8 c7129v8 = (C7129v8) obj2;
                if (c7129v8.f && !(c7129v8.b instanceof AbstractC3723f9.a)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    string = ((C7129v8) arrayList.get(0)).c;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i4 = 0;
                    for (Object obj3 : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            WE.l();
                            throw th;
                        }
                        spannableStringBuilder.append((CharSequence) CollectionsKt.F(StringsKt__StringsKt.split$default(((C7129v8) obj3).c, new String[]{" "}, false, 0, 6, null)));
                        if (i4 < arrayList.size() - 1) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        i4 = i5;
                    }
                    string = spannableStringBuilder.toString();
                }
            }
            view3.setTitle(string);
            view3.setSubtitle(string2);
            if (z) {
                view3.setLogo(th);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context2);
            Context context3 = view3.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "view.context");
            C7716xw0.a aVar = new C7716xw0.a(context3);
            if (arrayList.isEmpty()) {
                aVar.c = drawable;
                aVar.b(C7279vr.f(40));
                aVar.c(new C4363iC());
                aVar.d = new R7(view3);
                ?? r0 = th;
                aVar.m = r0;
                aVar.n = r0;
                aVar.o = r0;
            } else if (arrayList.size() == 1) {
                aVar.c = ((C7129v8) arrayList.get(0)).e;
                aVar.k = 2131231354;
                C7129v8 c7129v9 = (C7129v8) arrayList.get(0);
                Intrinsics.checkNotNullParameter(c7129v9, "<this>");
                String str = c7129v9.a;
                byte[] bArr = C6806tc2.a;
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    j4 = Long.parseLong(str);
                } catch (NumberFormatException unused) {
                    j4 = 0;
                }
                aVar.l = Integer.valueOf(j4 < 0 ? 2131231346 : 2131231354);
                aVar.b(C7279vr.f(40));
                aVar.c(new C4363iC());
                aVar.d = new Q7(view3, view3, view3);
                aVar.m = null;
                aVar.n = null;
                aVar.o = null;
            } else if (arrayList.size() > 1) {
                view3.setLogo(null);
            }
            interfaceC6246qw0I.a(aVar.a());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 1;
                    break;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 2;
                    break;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 4;
                    break;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 8;
                    break;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 16;
                    break;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 32;
                    break;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.S |= 64;
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
