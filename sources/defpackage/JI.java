package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class JI implements DI {

    @NotNull
    public final PackageManager a;

    @NotNull
    public final Context b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final ReporterApi d;

    public JI(@NotNull PackageManager packageManager, @NotNull Context context, @NotNull C4923kf appData, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = packageManager;
        this.b = context;
        this.c = appData;
        this.d = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(JI ji, LM lm) {
        EI ei;
        PackageManager packageManager;
        if (lm instanceof EI) {
            ei = (EI) lm;
            int i = ei.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ei.h = i - Integer.MIN_VALUE;
            } else {
                ei = new EI(ji, lm);
            }
        } else {
            ei = new EI(ji, lm);
        }
        Object obj = ei.e;
        Object obj2 = MN.d;
        int i2 = ei.h;
        boolean z = true;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                PackageManager packageManager2 = ji.a;
                ei.d = packageManager2;
                ei.h = 1;
                Object objG = ji.g(ei);
                if (objG == obj2) {
                    return obj2;
                }
                obj = objG;
                packageManager = packageManager2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                packageManager = ei.d;
                C1795Pt1.b(obj);
            }
            C4699jb1.a(packageManager, (String) obj);
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r6.j(r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(defpackage.JI r6, defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.HI
            if (r0 == 0) goto L13
            r0 = r7
            HI r0 = (defpackage.HI) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            HI r0 = new HI
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L7d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            JI r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L65
        L3b:
            JI r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L52
        L41:
            defpackage.C1795Pt1.b(r7)
            r0.d = r6
            r0.h = r5
            r6.getClass()
            java.lang.Object r7 = f(r6, r0)
            if (r7 != r1) goto L52
            goto L7c
        L52:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L71
            r0.d = r6
            r0.h = r4
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L65
            goto L7c
        L65:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6e
            goto L71
        L6e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L71:
            r7 = 0
            r0.d = r7
            r0.h = r3
            java.lang.Object r6 = r6.j(r0)
            if (r6 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JI.i(JI, LM):java.lang.Object");
    }

    @Override // defpackage.DI
    @Nullable
    public final Object b(@NotNull LM lm) {
        return f(this, lm);
    }

    @Override // defpackage.DI
    @Nullable
    public final Object c(@NotNull C2062Te1 c2062Te1) {
        return i(this, c2062Te1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LM lm) {
        FI fi;
        if (lm instanceof FI) {
            fi = (FI) lm;
            int i = fi.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi.g = i - Integer.MIN_VALUE;
            } else {
                fi = new FI(this, lm);
            }
        } else {
            fi = new FI(this, lm);
        }
        Object objA = fi.d;
        MN mn = MN.d;
        int i2 = fi.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.c.b;
            fi.g = 1;
            objA = C7236vf0.a(gp1, fi);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        String str = ((FF) objA).o;
        Intrinsics.checkNotNull(str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(LM lm) {
        GI gi;
        PackageManager packageManager;
        JI ji;
        if (lm instanceof GI) {
            gi = (GI) lm;
            int i = gi.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi.i = i - Integer.MIN_VALUE;
            } else {
                gi = new GI(this, lm);
            }
        } else {
            gi = new GI(this, lm);
        }
        Object obj = gi.g;
        MN mn = MN.d;
        int i2 = gi.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            ReporterApi.a.b(this.d, EnumC5028l80.E, null, null, 14);
            gi.d = this;
            PackageManager packageManager2 = this.a;
            gi.e = packageManager2;
            gi.i = 1;
            Object objG = g(gi);
            if (objG == mn) {
                return mn;
            }
            packageManager = packageManager2;
            obj = objG;
            ji = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            packageManager = gi.e;
            ji = gi.d;
            C1795Pt1.b(obj);
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
        if (launchIntentForPackage == null) {
            return Boolean.FALSE;
        }
        ji.b.startActivity(launchIntentForPackage);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(LM lm) {
        II ii;
        Context context;
        if (lm instanceof II) {
            ii = (II) lm;
            int i = ii.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ii.h = i - Integer.MIN_VALUE;
            } else {
                ii = new II(this, lm);
            }
        } else {
            ii = new II(this, lm);
        }
        Object objA = ii.e;
        MN mn = MN.d;
        int i2 = ii.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            ReporterApi.a.b(this.d, EnumC5028l80.F, null, null, 14);
            GP1 gp1 = this.c.b;
            Context context2 = this.b;
            ii.d = context2;
            ii.h = 1;
            objA = C7236vf0.a(gp1, ii);
            if (objA == mn) {
                return mn;
            }
            context = context2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = ii.d;
            C1795Pt1.b(objA);
        }
        String str = ((FF) objA).p;
        Intrinsics.checkNotNull(str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
        return Unit.a;
    }
}
