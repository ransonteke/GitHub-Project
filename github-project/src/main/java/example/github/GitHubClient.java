package com.example.github;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class GitHubClient {
    public static void main(String[] args) {
        try {
            // Connect to GitHub (Use "GITHUB_TOKEN" from environment variables)
            GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));

            // Fetch a public repository (Replace with any repo name)
            GHRepository repo = github.getRepository("octocat/Hello-World");

            // Print repo details
            System.out.println("Repository: " + repo.getFullName());
            System.out.println("Description: " + repo.getDescription());
            System.out.println("Stars: " + repo.getStargazersCount());
            System.out.println("Forks: " + repo.getForksCount());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

