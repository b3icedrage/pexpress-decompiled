package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.fragment.app.g;
import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC1745Pd extends g implements InterfaceC2057Td {
    public LayoutInflaterFactory2C3192ce d;

    public ActivityC1745Pd() {
        getSavedStateRegistry().c("androidx:appcompat", new C1586Nd(this));
        addOnContextAvailableListener(new C1667Od(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        o().c(view, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:84:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0182  */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a3  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i;
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        HM hm;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        layoutInflaterFactory2C3192ce.T = true;
        int i38 = layoutInflaterFactory2C3192ce.X;
        if (i38 == -100) {
            i38 = AbstractC2759ae.e;
        }
        int iN = layoutInflaterFactory2C3192ce.N(context, i38);
        if (AbstractC2759ae.m(context)) {
            AbstractC2759ae.x(context);
        }
        OR0 or0A = LayoutInflaterFactory2C3192ce.A(context);
        if (LayoutInflaterFactory2C3192ce.p0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C3192ce.E(context, iN, or0A, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof HM) {
                    ((HM) context).a(LayoutInflaterFactory2C3192ce.E(context, iN, or0A, null, false));
                } else if (LayoutInflaterFactory2C3192ce.o0) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = null;
                    } else {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i2 = configuration.mcc;
                            i3 = configuration2.mcc;
                            if (i2 != i3) {
                                configuration3.mcc = i3;
                            }
                            i4 = configuration.mnc;
                            i5 = configuration2.mnc;
                            if (i4 != i5) {
                                configuration3.mnc = i5;
                            }
                            LayoutInflaterFactory2C3192ce.d.a(configuration, configuration2, configuration3);
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            i36 = configuration.densityDpi;
                            i37 = configuration2.densityDpi;
                            if (i36 != i37) {
                                configuration3.densityDpi = i37;
                            }
                        }
                    }
                    Configuration configurationE = LayoutInflaterFactory2C3192ce.E(context, iN, or0A, configuration3, true);
                    hm = new HM(context, R.style.Theme_AppCompat_Empty);
                    hm.a(configurationE);
                    if (context.getTheme() != null) {
                        theme = hm.getTheme();
                        if (i >= 29) {
                            C0623At1.a(theme);
                        } else {
                            synchronized (C8128zt1.a) {
                                if (!C8128zt1.c) {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    C8128zt1.b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    C8128zt1.c = true;
                                }
                                method = C8128zt1.b;
                                if (method != null) {
                                    method.invoke(theme, new Object[0]);
                                }
                            }
                        }
                    }
                    context = hm;
                }
            }
        } else if (context instanceof HM) {
            try {
                ((HM) context).a(LayoutInflaterFactory2C3192ce.E(context, iN, or0A, null, false));
            } catch (IllegalStateException unused2) {
                if (LayoutInflaterFactory2C3192ce.o0) {
                    i = Build.VERSION.SDK_INT;
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i2 = configuration.mcc;
                            i3 = configuration2.mcc;
                            if (i2 != i3) {
                                configuration3.mcc = i3;
                            }
                            i4 = configuration.mnc;
                            i5 = configuration2.mnc;
                            if (i4 != i5) {
                                configuration3.mnc = i5;
                            }
                            LayoutInflaterFactory2C3192ce.d.a(configuration, configuration2, configuration3);
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            i36 = configuration.densityDpi;
                            i37 = configuration2.densityDpi;
                            if (i36 != i37) {
                                configuration3.densityDpi = i37;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationE2 = LayoutInflaterFactory2C3192ce.E(context, iN, or0A, configuration3, true);
                    hm = new HM(context, R.style.Theme_AppCompat_Empty);
                    hm.a(configurationE2);
                    try {
                        if (context.getTheme() != null) {
                            theme = hm.getTheme();
                            if (i >= 29) {
                                C0623At1.a(theme);
                            } else {
                                synchronized (C8128zt1.a) {
                                    if (!C8128zt1.c) {
                                        try {
                                            Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                            C8128zt1.b = declaredMethod2;
                                            declaredMethod2.setAccessible(true);
                                        } catch (NoSuchMethodException unused3) {
                                        }
                                        C8128zt1.c = true;
                                    }
                                    method = C8128zt1.b;
                                    if (method != null) {
                                        try {
                                            method.invoke(theme, new Object[0]);
                                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                                            C8128zt1.b = null;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NullPointerException unused5) {
                    }
                    context = hm;
                }
            }
        } else if (LayoutInflaterFactory2C3192ce.o0) {
            i = Build.VERSION.SDK_INT;
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i2 = configuration.mcc;
                    i3 = configuration2.mcc;
                    if (i2 != i3) {
                        configuration3.mcc = i3;
                    }
                    i4 = configuration.mnc;
                    i5 = configuration2.mnc;
                    if (i4 != i5) {
                        configuration3.mnc = i5;
                    }
                    LayoutInflaterFactory2C3192ce.d.a(configuration, configuration2, configuration3);
                    i6 = configuration.touchscreen;
                    i7 = configuration2.touchscreen;
                    if (i6 != i7) {
                        configuration3.touchscreen = i7;
                    }
                    i8 = configuration.keyboard;
                    i9 = configuration2.keyboard;
                    if (i8 != i9) {
                        configuration3.keyboard = i9;
                    }
                    i10 = configuration.keyboardHidden;
                    i11 = configuration2.keyboardHidden;
                    if (i10 != i11) {
                        configuration3.keyboardHidden = i11;
                    }
                    i12 = configuration.navigation;
                    i13 = configuration2.navigation;
                    if (i12 != i13) {
                        configuration3.navigation = i13;
                    }
                    i14 = configuration.navigationHidden;
                    i15 = configuration2.navigationHidden;
                    if (i14 != i15) {
                        configuration3.navigationHidden = i15;
                    }
                    i16 = configuration.orientation;
                    i17 = configuration2.orientation;
                    if (i16 != i17) {
                        configuration3.orientation = i17;
                    }
                    i18 = configuration.screenLayout & 15;
                    i19 = configuration2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration3.screenLayout |= i19;
                    }
                    i20 = configuration.screenLayout & 192;
                    i21 = configuration2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 48;
                    i23 = configuration2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 768;
                    i25 = configuration2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    if (i >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i26 = configuration.uiMode & 15;
                    i27 = configuration2.uiMode & 15;
                    if (i26 != i27) {
                        configuration3.uiMode |= i27;
                    }
                    i28 = configuration.uiMode & 48;
                    i29 = configuration2.uiMode & 48;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.screenWidthDp;
                    i31 = configuration2.screenWidthDp;
                    if (i30 != i31) {
                        configuration3.screenWidthDp = i31;
                    }
                    i32 = configuration.screenHeightDp;
                    i33 = configuration2.screenHeightDp;
                    if (i32 != i33) {
                        configuration3.screenHeightDp = i33;
                    }
                    i34 = configuration.smallestScreenWidthDp;
                    i35 = configuration2.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration3.smallestScreenWidthDp = i35;
                    }
                    i36 = configuration.densityDpi;
                    i37 = configuration2.densityDpi;
                    if (i36 != i37) {
                        configuration3.densityDpi = i37;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationE3 = LayoutInflaterFactory2C3192ce.E(context, iN, or0A, configuration3, true);
            hm = new HM(context, R.style.Theme_AppCompat_Empty);
            hm.a(configurationE3);
            if (context.getTheme() != null) {
                theme = hm.getTheme();
                if (i >= 29) {
                    C0623At1.a(theme);
                } else {
                    synchronized (C8128zt1.a) {
                        if (!C8128zt1.c) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            C8128zt1.b = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            C8128zt1.c = true;
                        }
                        method = C8128zt1.b;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    }
                }
            }
            context = hm;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC6068q5 abstractC6068q5P = p();
        if (getWindow().hasFeature(0)) {
            if (abstractC6068q5P == null || !abstractC6068q5P.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.ActivityC2686aH, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC6068q5 abstractC6068q5P = p();
        if (keyCode == 82 && abstractC6068q5P != null && abstractC6068q5P.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        return (T) o().f(i);
    }

    @Override // android.app.Activity
    @NonNull
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        if (layoutInflaterFactory2C3192ce.t == null) {
            layoutInflaterFactory2C3192ce.L();
            AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
            layoutInflaterFactory2C3192ce.t = new GV1(abstractC6068q5 != null ? abstractC6068q5.e() : layoutInflaterFactory2C3192ce.o);
        }
        return layoutInflaterFactory2C3192ce.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = C4240hd2.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        o().l();
    }

    @NonNull
    public final AbstractC2759ae o() {
        if (this.d == null) {
            C0585Ah.a aVar = AbstractC2759ae.d;
            this.d = new LayoutInflaterFactory2C3192ce(this, null, this, this);
        }
        return this.d;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        if (layoutInflaterFactory2C3192ce.K && layoutInflaterFactory2C3192ce.E) {
            layoutInflaterFactory2C3192ce.L();
            AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
            if (abstractC6068q5 != null) {
                abstractC6068q5.g();
            }
        }
        C5552ne c5552neA = C5552ne.a();
        Context context = layoutInflaterFactory2C3192ce.o;
        synchronized (c5552neA) {
            C6447rt1 c6447rt1 = c5552neA.a;
            synchronized (c6447rt1) {
                HT0<WeakReference<Drawable.ConstantState>> ht0 = c6447rt1.b.get(context);
                if (ht0 != null) {
                    ht0.a();
                }
            }
        }
        layoutInflaterFactory2C3192ce.W = new Configuration(layoutInflaterFactory2C3192ce.o.getResources().getConfiguration());
        layoutInflaterFactory2C3192ce.y(false, false);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Intent intentA;
        if (!super.onMenuItemSelected(i, menuItem)) {
            AbstractC6068q5 abstractC6068q5P = p();
            if (menuItem.getItemId() != 16908332 || abstractC6068q5P == null || (abstractC6068q5P.d() & 4) == 0 || (intentA = A21.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = A21.a(this);
            if (intentA2 == null) {
                intentA2 = A21.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = A21.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = A21.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e) {
                    b0.c("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C6333rM.startActivities(this, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C3192ce) o()).H();
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        layoutInflaterFactory2C3192ce.L();
        AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
        if (abstractC6068q5 != null) {
            abstractC6068q5.n(true);
        }
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C3192ce) o()).y(true, false);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onStop() {
        super.onStop();
        o().p();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        o().w(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC6068q5 abstractC6068q5P = p();
        if (getWindow().hasFeature(0)) {
            if (abstractC6068q5P == null || !abstractC6068q5P.k()) {
                super.openOptionsMenu();
            }
        }
    }

    public final AbstractC6068q5 p() {
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = (LayoutInflaterFactory2C3192ce) o();
        layoutInflaterFactory2C3192ce.L();
        return layoutInflaterFactory2C3192ce.s;
    }

    public final void q() {
        N7.u(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        ED.n(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        q();
        o().s(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C3192ce) o()).Y = i;
    }

    @Override // androidx.fragment.app.g
    public final void supportInvalidateOptionsMenu() {
        o().l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        q();
        o().t(view);
    }

    public ActivityC1745Pd(int i) {
        super(i);
        getSavedStateRegistry().c("androidx:appcompat", new C1586Nd(this));
        addOnContextAvailableListener(new C1667Od(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        o().u(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
