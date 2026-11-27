package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import groovy.lang.GroovyObject;
import java.lang.ref.SoftReference;
import java.net.URL;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

/* JADX INFO: renamed from: lk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5154lk0 implements GroovyObject {
    public static /* synthetic */ ClassInfo b;
    public static /* synthetic */ SoftReference c;
    public final HS0 a;

    public C5154lk0(HS0 hs0) {
        b();
        c();
        this.a = (HS0) ScriptBytecodeAdapter.castToType(hs0, HS0.class);
    }

    public static /* synthetic */ CallSiteArray a() {
        return new CallSiteArray(C5154lk0.class, new String[]{"setMainWatchURL", "informContextOfURLUsedForConfiguration", "run", "text", "informContextOfURLUsedForConfiguration", "toURL", "toURI", "run", "text", "<$constructor$>", "setProperty", "localHostName", "<$constructor$>", "addCompilationCustomizers", "importCustomizer", "addCompilationCustomizers", "getProperty", "isEmpty", "equalsIgnoreCase", "equalsIgnoreCase", "addNewInstanceToContext", "addGroovyPackages", "<$constructor$>", "getFrameworkPackages", "parse", "<$constructor$>", "mixin", "metaClass", "setContext", "metaClass", "run", "<$constructor$>", "addStarImports", "addImports", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticStars", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME, "addStaticImport", AppMeasurementSdk.ConditionalUserProperty.NAME});
    }

    public static /* synthetic */ CallSite[] b() {
        CallSiteArray callSiteArrayA;
        SoftReference softReference = c;
        if (softReference == null || (callSiteArrayA = (CallSiteArray) softReference.get()) == null) {
            callSiteArrayA = a();
            c = new SoftReference(callSiteArrayA);
        }
        return callSiteArrayA.array;
    }

    public final /* synthetic */ void c() {
        if (getClass() != C5154lk0.class) {
            ScriptBytecodeAdapter.initMetaClass(this);
            return;
        }
        ClassInfo classInfo = b;
        if (classInfo == null) {
            classInfo = ClassInfo.getClassInfo(getClass());
            b = classInfo;
        }
        classInfo.getMetaClass();
    }

    public final void d(URL url) {
        b()[0].call(C4852kJ.class, this.a, url);
    }

    public final void e(URL url) {
        CallSite[] callSiteArrB = b();
        if (BytecodeInterface8.disabledStandardMetaClass()) {
            callSiteArrB[1].callCurrent(this, url);
        } else {
            d(url);
        }
        callSiteArrB[2].callCurrent(this, callSiteArrB[3].callGetProperty(url));
    }
}
