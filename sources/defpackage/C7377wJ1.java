package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.j;
import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: wJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7377wJ1 implements SuccessContinuation {
    public Object d;

    public void a(Class cls, Class cls2, String str) {
        ((HashMap) this.d).put(new C3864fp0(cls, str.toLowerCase()), cls2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ZB0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
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
    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public Task then(Object obj) throws Throwable {
        ?? C;
        l lVar;
        C7587xJ1 c7587xJ1 = (C7587xJ1) this.d;
        FJ1 fj1 = c7587xJ1.b;
        YK yk = c7587xJ1.f;
        yk.getClass();
        ?? r5 = 0;
        try {
            HashMap mapB = YK.b(fj1);
            C0613Aq0 c0613Aq0 = new C0613Aq0((String) yk.d, mapB);
            c0613Aq0.c("User-Agent", "Crashlytics Android SDK/18.3.5");
            c0613Aq0.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            YK.a(c0613Aq0, fj1);
            Log.isLoggable("FirebaseCrashlytics", 3);
            mapB.toString();
            Log.isLoggable("FirebaseCrashlytics", 2);
            C = yk.c(c0613Aq0.b());
        } catch (IOException e) {
            b0.d("FirebaseCrashlytics", "Settings request failed.", e);
            C = 0;
        }
        if (C != 0) {
            C6326rJ1 c6326rJ1A = c7587xJ1.c.a(C);
            ?? r7 = c6326rJ1A.c;
            C7087ux c7087ux = c7587xJ1.e;
            c7087ux.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                try {
                    try {
                        C.put("expires_at", r7);
                        try {
                            try {
                                lVar = new l(new j(j.c((File) c7087ux.a, null, false)));
                                try {
                                    lVar.write(C.toString());
                                    lVar.flush();
                                    r7 = lVar;
                                } catch (Exception e2) {
                                    e = e2;
                                    b0.d("FirebaseCrashlytics", "Failed to cache settings", e);
                                    r7 = lVar;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                e = e;
                                lVar = null;
                                b0.d("FirebaseCrashlytics", "Failed to cache settings", e);
                                r7 = lVar;
                                C7155vG.a(r7, "Failed to close settings writer.");
                                C.toString();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                String str = fj1.f;
                                SharedPreferences.Editor editorEdit = c7587xJ1.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                                editorEdit.putString("existing_instance_identifier", str);
                                editorEdit.apply();
                                c7587xJ1.h.set(c6326rJ1A);
                                c7587xJ1.i.get().trySetResult(c6326rJ1A);
                                return Tasks.forResult(null);
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        C7155vG.a(r5, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
                C7155vG.a(r7, "Failed to close settings writer.");
                C.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                String str2 = fj1.f;
                SharedPreferences.Editor editorEdit2 = c7587xJ1.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                c7587xJ1.h.set(c6326rJ1A);
                c7587xJ1.i.get().trySetResult(c6326rJ1A);
            } catch (Throwable th2) {
                th = th2;
                r5 = r7;
            }
        }
        return Tasks.forResult(null);
    }
}
