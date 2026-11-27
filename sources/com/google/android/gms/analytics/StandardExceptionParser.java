package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.C5896pG;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet zza = new TreeSet();

    public StandardExceptionParser(@NonNull Context context, @NonNull Collection<String> collection) {
        setIncludedPackages(context, collection);
    }

    public StackTraceElement getBestStackTraceElement(@NonNull Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || (stackTrace.length) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                if (className.startsWith((String) it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }

    @NonNull
    public Throwable getCause(@NonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    @NonNull
    public String getDescription(String str, @NonNull Throwable th) {
        return getDescription(getCause(th), getBestStackTraceElement(getCause(th)), str);
    }

    public void setIncludedPackages(@NonNull Context context, @NonNull Collection<String> collection) {
        this.zza.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            boolean z = true;
            for (String str2 : this.zza) {
                if (!str.startsWith(str2)) {
                    if (!str2.startsWith(str)) {
                        break;
                    }
                    this.zza.remove(str2);
                    break;
                }
                z = false;
            }
            if (z) {
                this.zza.add(str);
            }
        }
    }

    @NonNull
    public String getDescription(@NonNull Throwable th, StackTraceElement stackTraceElement, String str) {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] strArrSplit = stackTraceElement.getClassName().split("\\.");
            String str2 = (strArrSplit == null || (length = strArrSplit.length) <= 0) ? "unknown" : strArrSplit[length - 1];
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringBuilder sbA = C5896pG.a(" (@", str2, ":", methodName, ":");
            sbA.append(lineNumber);
            sbA.append(")");
            sb.append(sbA.toString());
        }
        if (str != null) {
            sb.append(" {" + str + "}");
        }
        return sb.toString();
    }
}
