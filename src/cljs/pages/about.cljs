(ns myapp.pages.about)

;; -------------------------
;; Views

(defn about-page []
  [:div [:h2 "Welcome to about"]
   [:div [:a {:href "/"} "go to home page"]]])

