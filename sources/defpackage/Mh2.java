package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Mh2 {
    public static final AbstractC4027gd.d a;
    public static final AbstractC4027gd.d b;
    public static final AbstractC4027gd.d c;
    public static final AbstractC4027gd.d d;

    public class a extends AbstractC4027gd.i {
        public final Pattern d;

        public a() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // defpackage.AbstractC4027gd
        public final boolean d() {
            int i;
            PackageInfo packageInfoA;
            boolean zD = super.d();
            if (!zD || (i = Build.VERSION.SDK_INT) >= 29) {
                return zD;
            }
            int i2 = Bh2.a;
            if (i >= 26) {
                packageInfoA = WebView.getCurrentWebViewPackage();
            } else {
                try {
                    packageInfoA = Bh2.a();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfoA = null;
                }
            }
            if (packageInfoA == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(packageInfoA.versionName);
            return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends AbstractC4027gd.d {
        @Override // defpackage.AbstractC4027gd
        public final boolean d() {
            if (!super.d() || !C3057c.j("MULTI_PROCESS")) {
                return false;
            }
            int i = Bh2.a;
            if (Mh2.b.d()) {
                return Zh2.a.a.getStatics().isMultiProcessEnabled();
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    public class c extends AbstractC4027gd.d {
        @Override // defpackage.AbstractC4027gd
        public final boolean d() {
            if (C3057c.j("MULTI_PROFILE")) {
                return super.d();
            }
            return false;
        }
    }

    static {
        new AbstractC4027gd.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new AbstractC4027gd.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new AbstractC4027gd.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new AbstractC4027gd.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new AbstractC4027gd.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new AbstractC4027gd.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new AbstractC4027gd.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new AbstractC4027gd.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new AbstractC4027gd.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new AbstractC4027gd.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new AbstractC4027gd.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new AbstractC4027gd.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new AbstractC4027gd.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new AbstractC4027gd.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new AbstractC4027gd.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new AbstractC4027gd.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new AbstractC4027gd.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new AbstractC4027gd.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new AbstractC4027gd.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new AbstractC4027gd.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new AbstractC4027gd.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new AbstractC4027gd.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new AbstractC4027gd.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new AbstractC4027gd.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new AbstractC4027gd.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new AbstractC4027gd.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new AbstractC4027gd.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new AbstractC4027gd.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        a = new AbstractC4027gd.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new AbstractC4027gd.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new AbstractC4027gd.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new AbstractC4027gd.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new AbstractC4027gd.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new AbstractC4027gd.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new AbstractC4027gd.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new AbstractC4027gd.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new AbstractC4027gd.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new AbstractC4027gd.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new AbstractC7605xP1.b();
        new AbstractC7605xP1.a();
        new AbstractC7605xP1.a();
        new AbstractC4027gd.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new a();
        new AbstractC4027gd.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        b = new AbstractC4027gd.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        new AbstractC4027gd.h("FORCE_DARK", "FORCE_DARK");
        new AbstractC4027gd.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        c = new AbstractC4027gd.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        d = new AbstractC4027gd.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new AbstractC4027gd.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new AbstractC4027gd.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new AbstractC4027gd.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new AbstractC4027gd.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new AbstractC4027gd.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new AbstractC4027gd.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b("MULTI_PROFILE", "MULTI_PROFILE");
        new AbstractC4027gd.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new AbstractC4027gd.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new AbstractC4027gd.d("MUTE_AUDIO", "MUTE_AUDIO");
        new AbstractC4027gd.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new AbstractC4027gd.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new AbstractC4027gd.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new AbstractC4027gd.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new c("PREFETCH_URL_V3", "PREFETCH_URL_V3");
        new AbstractC4027gd.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new AbstractC4027gd.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new AbstractC4027gd.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        new AbstractC4027gd.d("SPECULATIVE_LOADING_CONFIG", "SPECULATIVE_LOADING_CONFIG_V2");
    }
}
