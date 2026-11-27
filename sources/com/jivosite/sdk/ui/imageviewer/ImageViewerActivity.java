package com.jivosite.sdk.ui.imageviewer;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import coil.target.ImageViewTarget;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pexpress.tool.R;
import defpackage.AbstractC6068q5;
import defpackage.ActivityC1745Pd;
import defpackage.C0943Ew0;
import defpackage.C2017Sp1;
import defpackage.C5211m02;
import defpackage.C7716xw0;
import defpackage.InterfaceC6246qw0;
import defpackage.LE;
import defpackage.LayoutInflaterFactory2C3192ce;
import defpackage.ML0;
import defpackage.Ti2;
import defpackage.U0;
import defpackage.VP;
import defpackage.Vd2;
import defpackage.ViewOnClickListenerC3643em;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/jivosite/sdk/ui/imageviewer/ImageViewerActivity;", "LPd;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageViewerActivity extends ActivityC1745Pd {
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final v e;

    public static final class a extends ML0 implements Function0<x.b> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x.b invoke() {
            x.b defaultViewModelProviderFactory = ImageViewerActivity.this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class b extends ML0 implements Function0<Vd2> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Vd2 invoke() {
            Vd2 viewModelStore = ImageViewerActivity.this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public static final class c extends ML0 implements Function0<VP> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final VP invoke() {
            VP defaultViewModelCreationExtras = ImageViewerActivity.this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public ImageViewerActivity() {
        super(R.layout.activity_image_viewer);
        this.e = new v(C2017Sp1.a.b(C0943Ew0.class), new b(), new a(), new c());
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.ActivityC2686aH, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String string2 = extras != null ? extras.getString("path") : null;
        Bundle extras2 = getIntent().getExtras();
        String string3 = extras2 != null ? extras2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME) : null;
        PhotoView imageView = (PhotoView) findViewById(R.id.imageView);
        v vVar = this.e;
        ((C0943Ew0) vVar.getValue()).d = string2;
        C0943Ew0 c0943Ew0 = (C0943Ew0) vVar.getValue();
        if (string3 == null) {
            string = getString(R.string.download_status_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.download_status_error)");
        } else {
            string = string3;
        }
        c0943Ew0.getClass();
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        c0943Ew0.e = string;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        Object obj = layoutInflaterFactory2C3192ce.n;
        if (obj instanceof Activity) {
            layoutInflaterFactory2C3192ce.L();
            AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
            if (abstractC6068q5 instanceof Ti2) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C3192ce.t = null;
            if (abstractC6068q5 != null) {
                abstractC6068q5.h();
            }
            layoutInflaterFactory2C3192ce.s = null;
            if (toolbar != null) {
                C5211m02 c5211m02 = new C5211m02(toolbar, obj != null ? ((Activity) obj).getTitle() : layoutInflaterFactory2C3192ce.u, layoutInflaterFactory2C3192ce.q);
                layoutInflaterFactory2C3192ce.s = c5211m02;
                layoutInflaterFactory2C3192ce.q.e = c5211m02.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C3192ce.q.e = null;
            }
            layoutInflaterFactory2C3192ce.l();
        }
        AbstractC6068q5 abstractC6068q5P = p();
        if (abstractC6068q5P != null) {
            abstractC6068q5P.m(true);
            AbstractC6068q5 abstractC6068q5P2 = p();
            if (abstractC6068q5P2 != null) {
                abstractC6068q5P2.o(string3);
            }
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC3643em(this, 1));
        toolbar.l(R.menu.image_viewer_menu);
        Intrinsics.checkNotNullExpressionValue(imageView, "photoView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C7716xw0.a aVar = new C7716xw0.a(context2);
        aVar.c = string2;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        aVar.d = new ImageViewTarget(imageView);
        aVar.m = null;
        aVar.n = null;
        aVar.o = null;
        interfaceC6246qw0I.a(aVar.a());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "menuInflater");
        menuInflater.inflate(R.menu.image_viewer_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(@NotNull MenuItem item) {
        ClipboardManager clipboardManager;
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        v vVar = this.e;
        if (itemId == R.id.action_download) {
            U0.h(this, ((C0943Ew0) vVar.getValue()).d, ((C0943Ew0) vVar.getValue()).e);
            return true;
        }
        if (itemId != R.id.action_copy) {
            return super.onOptionsItemSelected(item);
        }
        String str = ((C0943Ew0) vVar.getValue()).d;
        Intrinsics.checkNotNullParameter(this, "context");
        if (str == null || (clipboardManager = (ClipboardManager) getSystemService("clipboard")) == null) {
            return true;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str));
        Toast.makeText(this, R.string.toast_copied_to_clipboard, 0).show();
        return true;
    }
}
