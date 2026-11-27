package com.jivosite.sdk.ui.chat;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.C2803b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.jivosite.sdk.lifecycle.JivoLifecycleObserver;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import com.jivosite.sdk.ui.chat.JivoChatFragment;
import com.pexpress.tool.R;
import defpackage.AF0;
import defpackage.AbstractC4936ki0;
import defpackage.AbstractC6076q7;
import defpackage.AbstractC7547x70;
import defpackage.B7;
import defpackage.BF0;
import defpackage.C0687Bp;
import defpackage.C0881Eb1;
import defpackage.C0957Fb;
import defpackage.C0997Fo0;
import defpackage.C1296Jk;
import defpackage.C1343Jz1;
import defpackage.C1550Mr;
import defpackage.C1619Nn;
import defpackage.C1690Ok1;
import defpackage.C3555eM1;
import defpackage.C4073gp;
import defpackage.C4176hJ1;
import defpackage.C4201hS;
import defpackage.C5038lB;
import defpackage.C5153lk;
import defpackage.C5208m0;
import defpackage.C5236m7;
import defpackage.C5281mL;
import defpackage.C5302mS;
import defpackage.C5459nA0;
import defpackage.C5656o7;
import defpackage.C5664o9;
import defpackage.C6102qE1;
import defpackage.C6104qF0;
import defpackage.C6489s51;
import defpackage.C6523sF0;
import defpackage.C7574xF0;
import defpackage.C7784yF0;
import defpackage.C7904yp;
import defpackage.C7994zF0;
import defpackage.DB;
import defpackage.E80;
import defpackage.EK1;
import defpackage.F8;
import defpackage.InterfaceC1454Lk1;
import defpackage.InterfaceC4813k7;
import defpackage.InterfaceC4819k81;
import defpackage.InterfaceC7011ub1;
import defpackage.K8;
import defpackage.KW1;
import defpackage.M4;
import defpackage.ML0;
import defpackage.P5;
import defpackage.RA;
import defpackage.RD;
import defpackage.Rd2;
import defpackage.SF0;
import defpackage.T5;
import defpackage.UF0;
import defpackage.ViewOnClickListenerC6733tF0;
import defpackage.W5;
import defpackage.W6;
import defpackage.WF0;
import defpackage.XO0;
import defpackage.Y20;
import defpackage.Z2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/jivosite/sdk/ui/chat/JivoChatFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class JivoChatFragment extends Fragment {
    public InterfaceC1454Lk1 d;
    public C3555eM1<RA> e;
    public Rd2<SF0> g;

    @NotNull
    public final KW1 h;
    public AbstractC6076q7<String> i;
    public AbstractC6076q7<String> j;
    public Uri k;
    public ContentResolver l;
    public AbstractC4936ki0 m;

    @NotNull
    public final C1619Nn n;

    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            Intrinsics.c(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iM0 = linearLayoutManager.M0();
            Integer numValueOf = Integer.valueOf(iM0);
            C0881Eb1 c0881Eb1 = null;
            if (iM0 < linearLayoutManager.z() - 3) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                SF0 sf0I = JivoChatFragment.this.i();
                InterfaceC7011ub1 interfaceC7011ub1 = sf0I.i;
                C0881Eb1 state = interfaceC7011ub1.getState();
                if (state.b && !state.a) {
                    c0881Eb1 = state;
                }
                if (c0881Eb1 != null) {
                    interfaceC7011ub1.j();
                    C0997Fo0 c0997Fo0 = (C0997Fo0) CollectionsKt.N(sf0I.h.getState().a);
                    if (c0997Fo0 == null) {
                        return;
                    }
                    sf0I.l.a(new SocketMessage("atom/me.history", Long.valueOf(c0997Fo0.f).toString(), null, null, null, null, null, 124, null));
                }
            }
        }
    }

    public static final class b extends ML0 implements Function1<AbstractC7547x70, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC7547x70 abstractC7547x70) {
            String string;
            AbstractC7547x70 error = abstractC7547x70;
            Intrinsics.checkNotNullParameter(error, "error");
            boolean z = error instanceof AbstractC7547x70.b;
            JivoChatFragment jivoChatFragment = JivoChatFragment.this;
            if (z) {
                string = jivoChatFragment.requireContext().getString(R.string.message_unsupported_media);
            } else {
                if (!(error instanceof AbstractC7547x70.a)) {
                    throw new C6489s51();
                }
                string = jivoChatFragment.requireContext().getString(R.string.media_uploading_too_large, 10);
            }
            Intrinsics.checkNotNullExpressionValue(string, "when (error) {\n         …          )\n            }");
            Toast.makeText(jivoChatFragment.requireContext(), string, 0).show();
            return Unit.a;
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            JivoChatFragment jivoChatFragment = JivoChatFragment.this;
            jivoChatFragment.i().B.k(String.valueOf(charSequence));
            jivoChatFragment.i().z.k(String.valueOf(charSequence));
        }
    }

    public static final class d extends ML0 implements Function0<SF0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SF0 invoke() {
            JivoChatFragment jivoChatFragment = JivoChatFragment.this;
            g gVarRequireActivity = jivoChatFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity()");
            Rd2<SF0> rd2 = jivoChatFragment.g;
            if (rd2 != null) {
                return (SF0) new x(gVarRequireActivity, rd2).a(SF0.class);
            }
            Intrinsics.l("viewModelFactory");
            throw null;
        }
    }

    public JivoChatFragment() {
        super(R.layout.fragment_jivo_chat);
        this.h = XO0.b(new d());
        this.n = new C1619Nn();
    }

    @NotNull
    public final SF0 i() {
        return (SF0) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        AbstractC6076q7<String> abstractC6076q7RegisterForActivityResult = registerForActivityResult(new C5236m7(), new InterfaceC4813k7() { // from class: wF0
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
            @Override // defpackage.InterfaceC4813k7
            public final void b(Object obj) throws IOException {
                long j;
                String mimeType;
                String fileName;
                InputStream inputStream;
                Uri uri = (Uri) obj;
                JivoChatFragment this$0 = this.a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (uri != null) {
                    this$0.k = uri;
                    ContentResolver contentResolver = this$0.requireContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "requireContext().contentResolver");
                    this$0.l = contentResolver;
                    if (contentResolver == null) {
                        Intrinsics.l("contentResolver");
                        throw null;
                    }
                    Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            int columnIndex2 = cursorQuery.getColumnIndex("_size");
                            cursorQuery.moveToFirst();
                            String string = cursorQuery.getString(columnIndex);
                            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                            j = cursorQuery.getLong(columnIndex2);
                            ContentResolver contentResolver2 = this$0.l;
                            if (contentResolver2 == null) {
                                Intrinsics.l("contentResolver");
                                throw null;
                            }
                            Uri uri2 = this$0.k;
                            if (uri2 == null) {
                                Intrinsics.l("contentUri");
                                throw null;
                            }
                            InputStream inputStreamOpenInputStream = contentResolver2.openInputStream(uri2);
                            ContentResolver contentResolver3 = this$0.l;
                            if (contentResolver3 == null) {
                                Intrinsics.l("contentResolver");
                                throw null;
                            }
                            Uri uri3 = this$0.k;
                            if (uri3 == null) {
                                Intrinsics.l("contentUri");
                                throw null;
                            }
                            mimeType = contentResolver3.getType(uri3);
                            if (mimeType == null) {
                                mimeType = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(mimeType, "contentResolver.getType(contentUri) ?: \"\"");
                            }
                            Unit unit = Unit.a;
                            cursorQuery.close();
                            fileName = string;
                            inputStream = inputStreamOpenInputStream;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C6621sj.b(cursorQuery, th);
                                throw th2;
                            }
                        }
                    } else {
                        j = 0;
                        fileName = "";
                        inputStream = null;
                        mimeType = fileName;
                    }
                    SF0 sf0I = this$0.i();
                    String contentUri = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(contentUri, "uri.toString()");
                    sf0I.getClass();
                    Intrinsics.checkNotNullParameter(fileName, "fileName");
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    Intrinsics.checkNotNullParameter(contentUri, "contentUri");
                    int i = (int) j;
                    W11<Z70<AbstractC7547x70>> w11 = sf0I.G;
                    if (i > 10485760) {
                        w11.k(new Z70<>(AbstractC7547x70.a.a));
                        return;
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
                    String str = extensionFromMimeType == null ? "" : extensionFromMimeType;
                    String str2 = (String) C6992uV1.a.get(str);
                    String str3 = str2 == null ? "unknown" : str2;
                    if (str3.equals("unknown")) {
                        w11.k(new Z70<>(AbstractC7547x70.b.a));
                    } else {
                        String str4 = mimeType;
                        sf0I.n.K(new C1351Kc0(fileName, str3, str, str4, inputStream, contentUri, j), new TF0(sf0I, contentUri, str4));
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC6076q7RegisterForActivityResult, "registerForActivityResul…dleContent(uri)\n        }");
        this.i = abstractC6076q7RegisterForActivityResult;
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC6076q7<String> abstractC6076q7RegisterForActivityResult2 = registerForActivityResult(new C5656o7(), new C7574xF0());
            Intrinsics.checkNotNullExpressionValue(abstractC6076q7RegisterForActivityResult2, "registerForActivityResul….RequestPermission()) { }");
            this.j = abstractC6076q7RegisterForActivityResult2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        int i = 3;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        super.onCreate(bundle);
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        C4201hS.a aVar = C6104qF0.c;
        if (aVar == null) {
            WF0 wf0D = C6104qF0.d();
            C7784yF0 c7784yF0 = new C7784yF0(this);
            C4201hS.a aVar2 = new C4201hS.a();
            aVar2.a = new C7904yp(c7784yF0, i3);
            C4201hS c4201hS2 = ((C4201hS) wf0D).a;
            InterfaceC1454Lk1 interfaceC1454Lk1 = c4201hS2.p;
            aVar2.b = new C5153lk(c7784yF0, new C1343Jz1(interfaceC1454Lk1), i4);
            aVar2.c = new M4(c7784yF0, new C5664o9(interfaceC1454Lk1, i3), i);
            aVar2.d = new BF0(c7784yF0, new C1296Jk(interfaceC1454Lk1, 1), i2);
            InterfaceC1454Lk1 interfaceC1454Lk2 = c4201hS2.H;
            aVar2.e = new C5038lB(c7784yF0, new C0687Bp(interfaceC1454Lk1, interfaceC1454Lk2), i4);
            aVar2.f = new C4073gp(c7784yF0, new RD(interfaceC1454Lk1, interfaceC1454Lk2, i2), i3);
            aVar2.g = new W6(c7784yF0, new C5664o9(interfaceC1454Lk1, i2), c4201hS2.I, i3);
            aVar2.h = new Z2(c7784yF0, new K8(interfaceC1454Lk1, interfaceC1454Lk2, 0), i4);
            aVar2.i = new C7994zF0(c7784yF0, new F8(interfaceC1454Lk1, interfaceC1454Lk2, i2), i2);
            aVar2.j = new P5(c7784yF0, i4);
            aVar2.k = new DB(c7784yF0, i4);
            InterfaceC1454Lk1 interfaceC1454Lk3 = c4201hS2.c;
            aVar2.l = new C5459nA0(c7784yF0, new T5(interfaceC1454Lk3, c4201hS2.z, interfaceC1454Lk1, i4), i3);
            aVar2.m = new B7(c7784yF0, i4);
            aVar2.n = new W5(c7784yF0, new C1550Mr(interfaceC1454Lk3, c4201hS2.A, i), i3);
            int i5 = C4176hJ1.c;
            ArrayList arrayList = new ArrayList(14);
            List list = Collections.EMPTY_LIST;
            arrayList.add(C5208m0.b(aVar2.a));
            arrayList.add(C5208m0.b(aVar2.b));
            arrayList.add(C5208m0.b(aVar2.c));
            arrayList.add(C5208m0.b(aVar2.d));
            arrayList.add(C5208m0.b(aVar2.e));
            arrayList.add(C5208m0.b(aVar2.f));
            arrayList.add(C5208m0.b(aVar2.g));
            arrayList.add(C5208m0.b(aVar2.h));
            arrayList.add(C5208m0.b(aVar2.i));
            arrayList.add(C5208m0.b(aVar2.j));
            arrayList.add(C5208m0.b(aVar2.k));
            arrayList.add(C5208m0.b(aVar2.l));
            arrayList.add(C5208m0.b(aVar2.m));
            arrayList.add(C5208m0.b(aVar2.n));
            aVar2.o = Y20.b(new C1690Ok1(new AF0(c7784yF0, new C4176hJ1(arrayList, list))));
            aVar2.p = new UF0(c4201hS2.p, c4201hS2.k, c4201hS2.y, c4201hS2.q, c4201hS2.n, c4201hS2.r, c4201hS2.s, c4201hS2.t, c4201hS2.x, c4201hS2.F, c4201hS2.v, c4201hS2.c, c4201hS2.b, c4201hS2.w, c4201hS2.z, c4201hS2.E, c4201hS2.A);
            C6104qF0.c = aVar2;
            aVar = aVar2;
        }
        this.d = aVar.o;
        this.g = new Rd2<>(aVar.p);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C6104qF0.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.n.a(null);
        AbstractC4936ki0 abstractC4936ki0 = this.m;
        if (abstractC4936ki0 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        ArrayList arrayList = abstractC4936ki0.H.o0;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        i().o(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i().o(true);
        JivoLifecycleObserver jivoLifecycleObserver = C6104qF0.f;
        if (jivoLifecycleObserver == null) {
            Intrinsics.l("lifecycleObserver");
            throw null;
        }
        C6102qE1 c6102qE1 = jivoLifecycleObserver.d;
        if (StringsKt.I(c6102qE1.b)) {
            C6104qF0.a("WidgetId is empty, service is turned off");
            return;
        }
        EK1 ek1 = jivoLifecycleObserver.e;
        if (C0957Fb.e(ek1.a())) {
            C6104qF0.a("Blacklisted until " + C0957Fb.k(ek1.a()) + ", service is turned off");
            return;
        }
        if (C0957Fb.e(ek1.c())) {
            C6104qF0.a("Sanctioned until " + C0957Fb.k(ek1.c()) + ", service is turned off");
            return;
        }
        if (!((Boolean) ek1.d.a(EK1.z[3], ek1)).booleanValue() || jivoLifecycleObserver.h) {
            C6104qF0.a("SDK moved to foreground, service is turned off");
            return;
        }
        int i = JivoWebSocketService.q;
        Context appContext = c6102qE1.a;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intent intent = new Intent(appContext, (Class<?>) JivoWebSocketService.class);
        intent.setAction("com.jivosite.sdk.socket.JivoWebSocketService.ACTION_LOAD_CONFIG");
        try {
            appContext.startService(intent);
        } catch (IllegalStateException e) {
            C6104qF0.c("Can not start jivo sdk service from background", e);
        }
        jivoLifecycleObserver.h = true;
        C6104qF0.a("SDK moved to foreground, load config");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C6104qF0.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 1;
        int i2 = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC1454Lk1 interfaceC1454Lk1 = this.d;
        if (interfaceC1454Lk1 == null) {
            Intrinsics.l("chatAdapterProvider");
            throw null;
        }
        Object obj = interfaceC1454Lk1.get();
        Intrinsics.checkNotNullExpressionValue(obj, "chatAdapterProvider.get()");
        this.e = (C3555eM1) obj;
        int i3 = AbstractC4936ki0.M;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        AbstractC4936ki0 abstractC4936ki0 = (AbstractC4936ki0) ViewDataBinding.n(null, view, R.layout.fragment_jivo_chat);
        abstractC4936ki0.A(this);
        abstractC4936ki0.B(i());
        abstractC4936ki0.x(getViewLifecycleOwner());
        abstractC4936ki0.J.setNavigationOnClickListener(new ViewOnClickListenerC6733tF0(this, i2));
        RecyclerView recyclerView = abstractC4936ki0.H;
        recyclerView.setItemAnimator(null);
        recyclerView.g(new C6523sF0());
        recyclerView.setHasFixedSize(false);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        C3555eM1<RA> c3555eM1 = this.e;
        if (c3555eM1 == null) {
            Intrinsics.l("chatAdapter");
            throw null;
        }
        recyclerView.setAdapter(c3555eM1);
        recyclerView.h(new a());
        this.n.a(recyclerView);
        TextInputEditText textInputEditText = abstractC4936ki0.G;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.inputText");
        textInputEditText.addTextChangedListener(new c());
        Intrinsics.checkNotNullExpressionValue(abstractC4936ki0, "bind(view).also { bindin…)\n            }\n        }");
        this.m = abstractC4936ki0;
        i().y.e(getViewLifecycleOwner(), new InterfaceC4819k81() { // from class: uF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj2) {
                List<? extends F7<T>> value = (List) obj2;
                JivoChatFragment this$0 = this.a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C3555eM1<RA> c3555eM2 = this$0.e;
                if (c3555eM2 == null) {
                    Intrinsics.l("chatAdapter");
                    throw null;
                }
                Intrinsics.checkNotNullExpressionValue(value, "it");
                Intrinsics.checkNotNullParameter(value, "value");
                if (c3555eM2.f.isEmpty()) {
                    c3555eM2.f = value;
                    c3555eM2.a.b();
                } else {
                    p.d dVarA = p.a(new C3555eM1.b(value, c3555eM2.f, c3555eM2.e));
                    Intrinsics.checkNotNullExpressionValue(dVarA, "calculateDiff(diffCallback)");
                    c3555eM2.f = value;
                    dVarA.a(new C2803b(c3555eM2));
                }
            }
        });
        i().G.e(getViewLifecycleOwner(), new E80(new b()));
        i().f.getState().e(getViewLifecycleOwner(), new InterfaceC4819k81() { // from class: vF0
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj2) {
                AbstractC4645jK state = (AbstractC4645jK) obj2;
                JivoChatFragment this$0 = this.a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(state, "state");
                AbstractC4936ki0 abstractC4936ki1 = this$0.m;
                if (abstractC4936ki1 == null) {
                    Intrinsics.l("binding");
                    throw null;
                }
                CardView cardView = abstractC4936ki1.C;
                Intrinsics.checkNotNullExpressionValue(cardView, "binding.connectionState");
                boolean z = true;
                if (state instanceof AbstractC4645jK.e ? true : Intrinsics.a(state, AbstractC4645jK.a.a) ? true : Intrinsics.a(state, AbstractC4645jK.g.a)) {
                    z = false;
                } else {
                    if (state instanceof AbstractC4645jK.f ? true : Intrinsics.a(state, AbstractC4645jK.b.a)) {
                        AbstractC4936ki0 abstractC4936ki2 = this$0.m;
                        if (abstractC4936ki2 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        CircularProgressIndicator circularProgressIndicator = abstractC4936ki2.A;
                        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.connectingView");
                        circularProgressIndicator.setVisibility(0);
                        AbstractC4936ki0 abstractC4936ki3 = this$0.m;
                        if (abstractC4936ki3 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        abstractC4936ki3.D.setText(R.string.connection_state_connecting);
                        AbstractC4936ki0 abstractC4936ki4 = this$0.m;
                        if (abstractC4936ki4 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        TextView textView = abstractC4936ki4.B;
                        Intrinsics.checkNotNullExpressionValue(textView, "binding.connectionRetry");
                        textView.setVisibility(8);
                    } else if (state instanceof AbstractC4645jK.c) {
                        AbstractC4936ki0 abstractC4936ki5 = this$0.m;
                        if (abstractC4936ki5 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        CircularProgressIndicator circularProgressIndicator2 = abstractC4936ki5.A;
                        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator2, "binding.connectingView");
                        circularProgressIndicator2.setVisibility(8);
                        AbstractC4936ki0 abstractC4936ki6 = this$0.m;
                        if (abstractC4936ki6 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        abstractC4936ki6.D.setText(this$0.getString(R.string.connection_state_disconnected, Long.valueOf(((AbstractC4645jK.c) state).b)));
                        AbstractC4936ki0 abstractC4936ki7 = this$0.m;
                        if (abstractC4936ki7 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        TextView textView2 = abstractC4936ki7.B;
                        Intrinsics.checkNotNullExpressionValue(textView2, "binding.connectionRetry");
                        textView2.setVisibility(0);
                    } else {
                        if (!(state instanceof AbstractC4645jK.d)) {
                            throw new C6489s51();
                        }
                        AbstractC4936ki0 abstractC4936ki8 = this$0.m;
                        if (abstractC4936ki8 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        CircularProgressIndicator circularProgressIndicator3 = abstractC4936ki8.A;
                        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator3, "binding.connectingView");
                        circularProgressIndicator3.setVisibility(8);
                        AbstractC4936ki0 abstractC4936ki9 = this$0.m;
                        if (abstractC4936ki9 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        abstractC4936ki9.D.setText(this$0.getString(R.string.connection_state_disconnected, Long.valueOf(((AbstractC4645jK.d) state).b)));
                        AbstractC4936ki0 abstractC4936ki10 = this$0.m;
                        if (abstractC4936ki10 == null) {
                            Intrinsics.l("binding");
                            throw null;
                        }
                        TextView textView3 = abstractC4936ki10.B;
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.connectionRetry");
                        textView3.setVisibility(0);
                    }
                }
                cardView.setVisibility(z ? 0 : 8);
            }
        });
        i().z.e(getViewLifecycleOwner(), new C5281mL(this, i));
        AbstractC4936ki0 abstractC4936ki1 = this.m;
        if (abstractC4936ki1 == null) {
            Intrinsics.l("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = abstractC4936ki1.z;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.banner");
        appCompatTextView.setVisibility(Intrinsics.a(i().o.d(), "1") ? 0 : 8);
    }
}
