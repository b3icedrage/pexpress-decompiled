package com.appsflyer.internal;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1cSDK {

    @NotNull
    private final AFd1uSDK registerClient;

    public AFe1cSDK(@NotNull AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        this.registerClient = aFd1uSDK;
    }

    private static String AFLogger(String str) {
        if (str != null) {
            return AFe1bSDK.AFKeystoreWrapper.replace(str, "*Non-printing character*");
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    public final void registerClient(@NotNull String str, @Nullable AFd1pSDK<String> aFd1pSDK, @NotNull Map<String, ? extends Object> map) {
        Throwable th;
        JSONObject jSONObject;
        String str2;
        NullPointerException nullPointerException;
        JSONObject jSONObject2;
        String str3;
        JSONObject jSONObject3;
        String string;
        String strAFLogger;
        Throwable th2;
        Exception exc;
        NullPointerException nullPointerException2;
        String str4;
        AFd1oSDK aFd1oSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        String str5 = null;
        try {
            jSONObject3 = new JSONObject(map);
            try {
                string = jSONObject3.toString();
                try {
                    strAFLogger = AFLogger(string);
                } catch (NullPointerException e) {
                    nullPointerException = e;
                    jSONObject2 = jSONObject3;
                    str3 = string;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", nullPointerException, false, false, false, false, 120, null);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1bSDK.getInstance;
                        Object method = map2.get(493299047);
                        if (method == null) {
                            method = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionGroup(0L) + 198, View.getDefaultSize(0, 0) + 35)).getMethod("d", Map.class);
                            map2.put(493299047, method);
                        }
                        string = (String) ((Method) method).invoke(null, objArr);
                        try {
                            strAFLogger = AFLogger(string);
                            jSONObject3 = jSONObject2;
                        } catch (NullPointerException e2) {
                            nullPointerException2 = e2;
                            str3 = string;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "AFJsonObject return null String object.", nullPointerException2, false, false, false, false, 120, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                        } catch (Exception e3) {
                            exc = e3;
                            str3 = string;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, false, false, 96, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                        } catch (Throwable th3) {
                            th2 = th3;
                            str3 = string;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Unexpected error", th2, false, false, false, false, 120, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                        }
                    } catch (Throwable th4) {
                        try {
                            Throwable cause = th4.getCause();
                            if (cause == null) {
                                throw th4;
                            }
                            throw cause;
                        } catch (NullPointerException e4) {
                            nullPointerException2 = e4;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "AFJsonObject return null String object.", nullPointerException2, false, false, false, false, 120, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                            str4 = string != null ? string : "";
                            if (Intrinsics.a(strAFLogger, str4)) {
                                strAFLogger = str4;
                            } else {
                                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Payload contains non-printing characters", false, 4, null);
                                try {
                                    jSONObject3 = new JSONObject(strAFLogger);
                                } catch (JSONException e5) {
                                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Couldn't parse the payload to a json object", e5, false, false, false, false, 120, null);
                                }
                            }
                            AFg1bSDK.registerClient(str + ": preparing data: ", jSONObject3);
                            if (aFd1pSDK != null) {
                                str5 = aFd1oSDK.d;
                            }
                            this.registerClient.AFKeystoreWrapper(str5, strAFLogger);
                        } catch (Exception e6) {
                            exc = e6;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, false, false, 96, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                            if (string != null) {
                            }
                            if (Intrinsics.a(strAFLogger, str4)) {
                                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Payload contains non-printing characters", false, 4, null);
                                jSONObject3 = new JSONObject(strAFLogger);
                            } else {
                                strAFLogger = str4;
                            }
                            AFg1bSDK.registerClient(str + ": preparing data: ", jSONObject3);
                            if (aFd1pSDK != null) {
                                str5 = aFd1oSDK.d;
                            }
                            this.registerClient.AFKeystoreWrapper(str5, strAFLogger);
                        } catch (Throwable th5) {
                            th2 = th5;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Unexpected error", th2, false, false, false, false, 120, null);
                            strAFLogger = "";
                            jSONObject3 = jSONObject2;
                            string = str3;
                            if (string != null) {
                            }
                            if (Intrinsics.a(strAFLogger, str4)) {
                                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Payload contains non-printing characters", false, 4, null);
                                jSONObject3 = new JSONObject(strAFLogger);
                            } else {
                                strAFLogger = str4;
                            }
                            AFg1bSDK.registerClient(str + ": preparing data: ", jSONObject3);
                            if (aFd1pSDK != null) {
                                str5 = aFd1oSDK.d;
                            }
                            this.registerClient.AFKeystoreWrapper(str5, strAFLogger);
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    jSONObject = jSONObject3;
                    str2 = string;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Unexpected error", th, false, false, false, false, 120, null);
                    jSONObject3 = jSONObject;
                    string = str2;
                    strAFLogger = "";
                }
            } catch (NullPointerException e7) {
                nullPointerException = e7;
                str3 = null;
                jSONObject2 = jSONObject3;
            } catch (Throwable th7) {
                th = th7;
                str2 = null;
                jSONObject = jSONObject3;
            }
        } catch (NullPointerException e8) {
            nullPointerException = e8;
            jSONObject2 = null;
            str3 = null;
        } catch (Throwable th8) {
            th = th8;
            jSONObject = null;
            str2 = null;
        }
        if (string != null) {
        }
        if (Intrinsics.a(strAFLogger, str4)) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Payload contains non-printing characters", false, 4, null);
            jSONObject3 = new JSONObject(strAFLogger);
        } else {
            strAFLogger = str4;
        }
        AFg1bSDK.registerClient(str + ": preparing data: ", jSONObject3);
        if (aFd1pSDK != null && (aFd1oSDK = aFd1pSDK.unregisterClient) != null) {
            str5 = aFd1oSDK.d;
        }
        this.registerClient.AFKeystoreWrapper(str5, strAFLogger);
    }
}
